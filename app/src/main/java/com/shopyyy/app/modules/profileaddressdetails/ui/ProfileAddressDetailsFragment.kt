package com.shopyyy.app.modules.profileaddressdetails.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseFragment
import com.shopyyy.app.databinding.FragmentProfileAddressDetailsBinding
import com.shopyyy.app.modules.profileaddressdetails.`data`.model.ListhomeaddressRowModel
import com.shopyyy.app.modules.profileaddressdetails.`data`.viewmodel.ProfileAddressDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileAddressDetailsFragment :
    BaseFragment<FragmentProfileAddressDetailsBinding>(R.layout.fragment_profile_address_details) {
  private val viewModel: ProfileAddressDetailsVM by viewModels<ProfileAddressDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listhomeaddressAdapter =
    ListhomeaddressAdapter(viewModel.listhomeaddressList.value?:mutableListOf())
    binding.recyclerListhomeaddress.adapter = listhomeaddressAdapter
    listhomeaddressAdapter.setOnItemClickListener(
    object : ListhomeaddressAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListhomeaddressRowModel) {
        onClickRecyclerListhomeaddress(view, position, item)
      }
    }
    )
    viewModel.listhomeaddressList.observe(requireActivity()) {
      listhomeaddressAdapter.updateData(it)
    }
    binding.profileAddressDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListhomeaddress(
    view: View,
    position: Int,
    item: ListhomeaddressRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ADDRESS_DETAILS_FRAGMENT"

  }
}
