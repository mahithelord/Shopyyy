package com.shopyyy.app.modules.productdiscover.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityProductDiscoverBinding
import com.shopyyy.app.modules.productdiscover.`data`.model.ListRowModel
import com.shopyyy.app.modules.productdiscover.`data`.viewmodel.ProductDiscoverVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductDiscoverActivity :
    BaseActivity<ActivityProductDiscoverBinding>(R.layout.activity_product_discover) {
  private val viewModel: ProductDiscoverVM by viewModels<ProductDiscoverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listAdapter = ListAdapter(viewModel.listList.value?:mutableListOf())
    binding.recyclerList.adapter = listAdapter
    listAdapter.setOnItemClickListener(
    object : ListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListRowModel) {
        onClickRecyclerList(view, position, item)
      }
    }
    )
    viewModel.listList.observe(this) {
      listAdapter.updateData(it)
    }
    binding.productDiscoverVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerList(
    view: View,
    position: Int,
    item: ListRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_DISCOVER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductDiscoverActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
