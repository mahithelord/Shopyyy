package com.shopyyy.app.modules.productdiscover.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ListRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPullBearExclu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pull_bear_exclu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_13_99)

)
