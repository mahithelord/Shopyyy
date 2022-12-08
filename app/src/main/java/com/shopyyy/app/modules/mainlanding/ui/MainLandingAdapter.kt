package com.shopyyy.app.modules.mainlanding.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.shopyyy.app.R
import com.shopyyy.app.databinding.RowMainLandingBinding
import com.shopyyy.app.modules.mainlanding.`data`.model.MainLandingRowModel
import kotlin.Int
import kotlin.collections.List

class MainLandingAdapter(
  var list: List<MainLandingRowModel>
) : RecyclerView.Adapter<MainLandingAdapter.RowMainLandingVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMainLandingVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_main_landing,parent,false)
    return RowMainLandingVH(view)
  }

  override fun onBindViewHolder(holder: RowMainLandingVH, position: Int) {
    val mainLandingRowModel = MainLandingRowModel()
    // TODO uncomment following line after integration with data source
    // val mainLandingRowModel = list[position]
    holder.binding.mainLandingRowModel = mainLandingRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MainLandingRowModel>) {
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
      item: MainLandingRowModel
    ) {
    }
  }

  inner class RowMainLandingVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMainLandingBinding = RowMainLandingBinding.bind(itemView)
  }
}
