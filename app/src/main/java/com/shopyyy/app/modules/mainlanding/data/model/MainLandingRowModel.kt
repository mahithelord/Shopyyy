package com.shopyyy.app.modules.mainlanding.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class MainLandingRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_43_90)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCottonblackdr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cotton_black_dr)

)
