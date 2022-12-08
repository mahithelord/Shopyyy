package com.shopyyy.app.modules.productpage.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.shopyyy.app.databinding.SlideritemProductPage1Binding
import com.shopyyy.app.modules.productpage.`data`.model.ImageSliderSliderrectangleelevenModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderrectangleelevenAdapter(
  val dataList: ArrayList<ImageSliderSliderrectangleelevenModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderrectangleelevenModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemProductPage1Binding) {
      binding.imageSliderSliderrectangleelevenModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemProductPage1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
