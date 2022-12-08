package com.shopyyy.app.modules.productsearch.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shopyyy.app.modules.productsearch.`data`.model.List1RowModel
import com.shopyyy.app.modules.productsearch.`data`.model.ProductSearchModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProductSearchVM : ViewModel(), KoinComponent {
  val productSearchModel: MutableLiveData<ProductSearchModel> =
      MutableLiveData(ProductSearchModel())

  var navArguments: Bundle? = null

  val listList: MutableLiveData<MutableList<List1RowModel>> = MutableLiveData(mutableListOf())
}
