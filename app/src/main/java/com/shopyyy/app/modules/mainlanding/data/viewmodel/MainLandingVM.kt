package com.shopyyy.app.modules.mainlanding.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shopyyy.app.modules.mainlanding.`data`.model.MainLandingModel
import com.shopyyy.app.modules.mainlanding.`data`.model.MainLandingRowModel
import com.shopyyy.app.modules.mainlanding.`data`.model.SpinnerGroup5654Model
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MainLandingVM : ViewModel(), KoinComponent {
  val mainLandingModel: MutableLiveData<MainLandingModel> = MutableLiveData(MainLandingModel())

  var navArguments: Bundle? = null

  val spinnerGroup5654List: MutableLiveData<MutableList<SpinnerGroup5654Model>> = MutableLiveData()

  val mainLandingList: MutableLiveData<MutableList<MainLandingRowModel>> =
      MutableLiveData(mutableListOf())
}
