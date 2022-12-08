package com.shopyyy.app.modules.profileprofileinfo1.`data`.model

import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileProfileInfo1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfilename: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_savannah_nguyen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.msg_allentown_new)

)
