package com.shopyyy.app.modules.profileprofileinfo1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shopyyy.app.modules.profileprofileinfo1.`data`.model.ProfileProfileInfo1Model
import org.koin.core.KoinComponent

class ProfileProfileInfo1VM : ViewModel(), KoinComponent {
  val profileProfileInfo1Model: MutableLiveData<ProfileProfileInfo1Model> =
      MutableLiveData(ProfileProfileInfo1Model())

  var navArguments: Bundle? = null
}
