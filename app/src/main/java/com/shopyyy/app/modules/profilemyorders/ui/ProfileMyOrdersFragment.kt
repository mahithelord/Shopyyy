package com.shopyyy.app.modules.profilemyorders.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseFragment
import com.shopyyy.app.databinding.FragmentProfileMyOrdersBinding
import com.shopyyy.app.modules.profilemyorders.`data`.model.ListpriceRowModel
import com.shopyyy.app.modules.profilemyorders.`data`.viewmodel.ProfileMyOrdersVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileMyOrdersFragment :
    BaseFragment<FragmentProfileMyOrdersBinding>(R.layout.fragment_profile_my_orders) {
  private val viewModel: ProfileMyOrdersVM by viewModels<ProfileMyOrdersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listpriceAdapter = ListpriceAdapter(viewModel.listpriceList.value?:mutableListOf())
    binding.recyclerListprice.adapter = listpriceAdapter
    listpriceAdapter.setOnItemClickListener(
    object : ListpriceAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpriceRowModel) {
        onClickRecyclerListprice(view, position, item)
      }
    }
    )
    viewModel.listpriceList.observe(requireActivity()) {
      listpriceAdapter.updateData(it)
    }
    binding.profileMyOrdersVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListprice(
    view: View,
    position: Int,
    item: ListpriceRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_MY_ORDERS_FRAGMENT"

  }
}
