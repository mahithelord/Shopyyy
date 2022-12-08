package com.shopyyy.app.modules.profileaddressdetails.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileAddressDetailsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_address_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddressCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_address_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCity: String? = MyApp.getInstance().resources.getString(R.string.lbl_city)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPostalCode: String? = MyApp.getInstance().resources.getString(R.string.lbl_postal_code)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhonenumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_phone_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentaddress: String? =
      MyApp.getInstance().resources.getString(R.string.msg_current_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627Value: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627OneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627TwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627ThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup5627FourValue: String? = null
)
