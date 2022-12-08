package com.shopyyy.app.modules.mainlanding.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shopyyy.app.databinding.SlideritemMainLanding1Binding
import com.shopyyy.app.modules.mainlanding.`data`.model.ImageSliderSlidershoesonheelsModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidershoesonheelsAdapter(
  val dataList: ArrayList<ImageSliderSlidershoesonheelsModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidershoesonheelsModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemMainLanding1Binding) {
      binding.imageSliderSlidershoesonheelsModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemMainLanding1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
