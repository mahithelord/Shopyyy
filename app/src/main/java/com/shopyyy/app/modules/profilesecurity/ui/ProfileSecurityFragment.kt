package com.shopyyy.app.modules.profilesecurity.ui

import androidx.fragment.app.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseFragment
import com.shopyyy.app.databinding.FragmentProfileSecurityBinding
import com.shopyyy.app.modules.profilesecurity.`data`.viewmodel.ProfileSecurityVM
import kotlin.String
import kotlin.Unit

class ProfileSecurityFragment :
    BaseFragment<FragmentProfileSecurityBinding>(R.layout.fragment_profile_security) {
  private val viewModel: ProfileSecurityVM by viewModels<ProfileSecurityVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.profileSecurityVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_SECURITY_FRAGMENT"

  }
}
