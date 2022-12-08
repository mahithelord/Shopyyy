package com.shopyyy.app.modules.productsearch.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class List1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSliders: String? = MyApp.getInstance().resources.getString(R.string.lbl_sliders2)

)
