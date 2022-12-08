package com.shopyyy.app.modules.mainlanding.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.base.BaseActivity
import com.shopyyy.app.databinding.ActivityMainLandingBinding
import com.shopyyy.app.modules.mainlanding.`data`.model.ImageSliderSlidershoesonheelsModel
import com.shopyyy.app.modules.mainlanding.`data`.model.MainLandingRowModel
import com.shopyyy.app.modules.mainlanding.`data`.model.SpinnerGroup5654Model
import com.shopyyy.app.modules.mainlanding.`data`.viewmodel.MainLandingVM
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class MainLandingActivity : BaseActivity<ActivityMainLandingBinding>(R.layout.activity_main_landing)
    {
  private val imageUri: Uri = Uri.parse("android.resource://com.shopyyy.app/drawable/img_image")


  private val imageSliderSlidershoesonheelsItems: ArrayList<ImageSliderSlidershoesonheelsModel> =
      arrayListOf(ImageSliderSlidershoesonheelsModel(imageImage =
  imageUri.toString()),ImageSliderSlidershoesonheelsModel(imageImage =
  imageUri.toString()))


  private val viewModel: MainLandingVM by viewModels<MainLandingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroup5654List.value = mutableListOf(
    SpinnerGroup5654Model("Item1"),
    SpinnerGroup5654Model("Item2"),
    SpinnerGroup5654Model("Item3"),
    SpinnerGroup5654Model("Item4"),
    SpinnerGroup5654Model("Item5")
    )
    val spinnerGroup5654Adapter =
    SpinnerGroup5654Adapter(this,R.layout.spinner_item,viewModel.spinnerGroup5654List.value?:
    mutableListOf())
    binding.spinnerGroup5654.adapter = spinnerGroup5654Adapter
    val slidershoesonheelsAdapter =
    SlidershoesonheelsAdapter(imageSliderSlidershoesonheelsItems,true)
    binding.imageSliderSlidershoesonheels.adapter = slidershoesonheelsAdapter
    binding.imageSliderSlidershoesonheels.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorGroup5646.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorGroup5646.updateIndicatorCounts(binding.imageSliderSlidershoesonheels.indicatorCount)
    val mainLandingAdapter =
    MainLandingAdapter(viewModel.mainLandingList.value?:mutableListOf())
    binding.recyclerMainLanding.adapter = mainLandingAdapter
    mainLandingAdapter.setOnItemClickListener(
    object : MainLandingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MainLandingRowModel) {
        onClickRecyclerMainLanding(view, position, item)
      }
    }
    )
    viewModel.mainLandingList.observe(this) {
      mainLandingAdapter.updateData(it)
    }
    binding.mainLandingVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidershoesonheels.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidershoesonheels.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerMainLanding(
    view: View,
    position: Int,
    item: MainLandingRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MAIN_LANDING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MainLandingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
