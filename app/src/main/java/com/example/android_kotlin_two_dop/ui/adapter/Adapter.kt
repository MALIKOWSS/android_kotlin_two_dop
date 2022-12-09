package com.example.android_kotlin_two_dop.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.android_kotlin_two_dop.ui.fragment.TwoFragment

class Adapter (
    fragment: Fragment
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int) = TwoFragment().apply {
        arguments = Bundle().apply {
            putInt(TwoFragment.ARG_ONBOARD_POSITION, position)
        }
    }
}