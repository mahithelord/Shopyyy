package com.shopyyy.app.modules.profileprofileinfo.ui

import androidx.fragment.app.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseFragment
import com.shopyyy.app.databinding.FragmentProfileProfileInfoBinding
import com.shopyyy.app.modules.profileprofileinfo.`data`.viewmodel.ProfileProfileInfoVM
import kotlin.String
import kotlin.Unit

class ProfileProfileInfoFragment :
    BaseFragment<FragmentProfileProfileInfoBinding>(R.layout.fragment_profile_profile_info) {
  private val viewModel: ProfileProfileInfoVM by viewModels<ProfileProfileInfoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileProfileInfoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_PROFILE_INFO_FRAGMENT"

  }
}
