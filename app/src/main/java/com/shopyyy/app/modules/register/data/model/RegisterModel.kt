package com.shopyyy.app.modules.register.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloRegister: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_register)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrLoginwith: String? = MyApp.getInstance().resources.getString(R.string.lbl_or_login_with)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5624Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5625Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5628Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627Value: String? = null
)
