package com.shopyyy.app.modules.productpage.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityProductPageBinding
import com.shopyyy.app.modules.productpage.`data`.model.ImageSliderSliderrectangleelevenModel
import com.shopyyy.app.modules.productpage.`data`.viewmodel.ProductPageVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class ProductPageActivity : BaseActivity<ActivityProductPageBinding>(R.layout.activity_product_page)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.shopyyy.app/drawable/img_rectangle11")


  private val imageSliderSliderrectangleelevenItems:
      ArrayList<ImageSliderSliderrectangleelevenModel> =
      arrayListOf(ImageSliderSliderrectangleelevenModel(imageRectangleEleven =
  imageUri.toString()),ImageSliderSliderrectangleelevenModel(imageRectangleEleven =
  imageUri.toString()))


  private val viewModel: ProductPageVM by viewModels<ProductPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderrectangleelevenAdapter =
    SliderrectangleelevenAdapter(imageSliderSliderrectangleelevenItems,true)
    binding.imageSliderSliderrectangleeleven.adapter = sliderrectangleelevenAdapter
    binding.imageSliderSliderrectangleeleven.onIndicatorProgress = { selectingPosition,
      progress ->
      binding.indicatorGroup5646.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup5646.updateIndicatorCounts(binding.imageSliderSliderrectangleeleven.indicatorCount)
    binding.productPageVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSliderrectangleeleven.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSliderrectangleeleven.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PRODUCT_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProductPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
