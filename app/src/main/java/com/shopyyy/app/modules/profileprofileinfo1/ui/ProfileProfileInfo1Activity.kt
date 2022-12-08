package com.shopyyy.app.modules.profileprofileinfo1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityProfileProfileInfo1Binding
import com.shopyyy.app.modules.profileprofileinfo1.`data`.viewmodel.ProfileProfileInfo1VM
import kotlin.String
import kotlin.Unit

class ProfileProfileInfo1Activity :
    BaseActivity<ActivityProfileProfileInfo1Binding>(R.layout.activity_profile_profile_info1) {
  private val viewModel: ProfileProfileInfo1VM by viewModels<ProfileProfileInfo1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileProfileInfo1VM = viewModel
    val adapter = ProfileProfileInfo1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup5706,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ProfileProfileInfo1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "PROFILE_PROFILE_INFO1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ProfileProfileInfo1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
