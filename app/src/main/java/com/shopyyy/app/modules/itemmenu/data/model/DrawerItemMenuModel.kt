package com.shopyyy.app.modules.itemmenu.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class DrawerItemMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCART: String? = MyApp.getInstance().resources.getString(R.string.lbl_cart)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPROFILE: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClothing: String? = MyApp.getInstance().resources.getString(R.string.lbl_clothing)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShoes: String? = MyApp.getInstance().resources.getString(R.string.lbl_shoes)

)
