package com.shopyyy.app.modules.profileaddressdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shopyyy.app.R
import com.shopyyy.app.databinding.RowListhomeaddressBinding
import com.shopyyy.app.modules.profileaddressdetails.`data`.model.ListhomeaddressRowModel
import kotlin.Int
import kotlin.collections.List

class ListhomeaddressAdapter(
  var list: List<ListhomeaddressRowModel>
) : RecyclerView.Adapter<ListhomeaddressAdapter.RowListhomeaddressVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListhomeaddressVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listhomeaddress,parent,false)
    return RowListhomeaddressVH(view)
  }

  override fun onBindViewHolder(holder: RowListhomeaddressVH, position: Int) {
    val listhomeaddressRowModel = ListhomeaddressRowModel()
    // TODO uncomment following line after integration with data source
    // val listhomeaddressRowModel = list[position]
    holder.binding.listhomeaddressRowModel = listhomeaddressRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListhomeaddressRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListhomeaddressRowModel
    ) {
    }
  }

  inner class RowListhomeaddressVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListhomeaddressBinding = RowListhomeaddressBinding.bind(itemView)
  }
}
