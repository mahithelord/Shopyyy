package com.shopyyy.app.modules.cart.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class CartRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortsinYello: String? =
      MyApp.getInstance().resources.getString(R.string.msg_shorts_in_yello)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_qty)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
