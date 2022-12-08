package com.shopyyy.app.modules.productsearch.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityProductSearchBinding
import com.shopyyy.app.modules.productsearch.`data`.model.List1RowModel
import com.shopyyy.app.modules.productsearch.`data`.viewmodel.ProductSearchVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProductSearchActivity :
    BaseActivity<ActivityProductSearchBinding>(R.layout.activity_product_search) {
  private val viewModel: ProductSearchVM by viewModels<ProductSearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listAdapter = ListAdapter(viewModel.listList.value?:mutableListOf())
    binding.recyclerList.adapter = listAdapter
    listAdapter.setOnItemClickListener(
    object : ListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : List1RowModel) {
        onClickRecyclerList(view, position, item)
      }
    }
    )
    viewModel.listList.observe(this) {
      listAdapter.updateData(it)
    }
    binding.productSearchVM = viewModel
    setUpSearchViewGroup5609Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerList(
    view: View,
    position: Int,
    item: List1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup5609Listener(): Unit {
    binding.searchViewGroup5609.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "PRODUCT_SEARCH_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ProductSearchActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
