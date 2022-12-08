package com.shopyyy.app.modules.mainlanding.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlidershoesonheelsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtShoesonheels: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shoes_on_heels)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_28_99)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageImage: String? = ""

)
