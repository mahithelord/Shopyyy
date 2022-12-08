package com.shopyyy.app.modules.appnavigation.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplash: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegister: String? = MyApp.getInstance().resources.getString(R.string.lbl_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMainLanding: String? = MyApp.getInstance().resources.getString(R.string.lbl_main_landing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductDiscover: String? =
      MyApp.getInstance().resources.getString(R.string.msg_product_discove)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductSearch: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_product_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCart: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileProfileInfo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_profi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProductPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_page)

)
