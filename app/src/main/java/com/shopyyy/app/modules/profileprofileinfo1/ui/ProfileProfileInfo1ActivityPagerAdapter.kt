package com.shopyyy.app.modules.profileprofileinfo1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.shopyyy.app.R
import com.shopyyy.app.appcomponents.di.MyApp
import com.shopyyy.app.modules.profileprofileinfo.ui.ProfileProfileInfoFragment
import com.shopyyy.app.modules.profilesecurity.ui.ProfileSecurityFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ProfileProfileInfo1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_profile_info),MyApp.getInstance().resources.getString(R.string.lbl_my_orders),MyApp.getInstance().resources.getString(R.string.lbl_security),MyApp.getInstance().resources.getString(R.string.lbl_address_details),MyApp.getInstance().resources.getString(R.string.lbl_log_out))

        val viewPages: List<Fragment> =
                listOf(ProfileProfileInfoFragment(),ProfileSecurityFragment(),ProfileSecurityFragment(),ProfileSecurityFragment(),ProfileSecurityFragment())

    }
}
