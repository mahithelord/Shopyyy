package com.shopyyy.app.modules.productpage.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ProductPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrintMaxiDres: String? =
      MyApp.getInstance().resources.getString(R.string.msg_print_maxi_dres)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_99_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_product_details)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mini_dress_with)

)
