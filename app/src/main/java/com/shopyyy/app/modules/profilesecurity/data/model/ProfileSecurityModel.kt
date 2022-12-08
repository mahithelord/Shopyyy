package com.shopyyy.app.modules.profilesecurity.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileSecurityModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtChangepassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_change_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentpasswor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_current_passwor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewpassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627OneValue: String? = null
)
