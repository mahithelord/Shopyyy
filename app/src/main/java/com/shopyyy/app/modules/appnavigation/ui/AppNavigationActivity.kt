package com.shopyyy.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityAppNavigationBinding
import com.shopyyy.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.shopyyy.app.modules.cart.ui.CartActivity
import com.shopyyy.app.modules.login.ui.LoginActivity
import com.shopyyy.app.modules.mainlanding.ui.MainLandingActivity
import com.shopyyy.app.modules.productdiscover.ui.ProductDiscoverActivity
import com.shopyyy.app.modules.productpage.ui.ProductPageActivity
import com.shopyyy.app.modules.productsearch.ui.ProductSearchActivity
import com.shopyyy.app.modules.profileprofileinfo1.ui.ProfileProfileInfo1Activity
import com.shopyyy.app.modules.register.ui.RegisterActivity
import com.shopyyy.app.modules.splash.ui.SplashActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearProductDiscover.setOnClickListener {
      val destIntent = ProductDiscoverActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfileProfileInfo.setOnClickListener {
      val destIntent = ProfileProfileInfo1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProductPage.setOnClickListener {
      val destIntent = ProductPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegister.setOnClickListener {
      val destIntent = RegisterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProductSearch.setOnClickListener {
      val destIntent = ProductSearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMainLanding.setOnClickListener {
      val destIntent = MainLandingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCart.setOnClickListener {
      val destIntent = CartActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
