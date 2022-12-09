package com.example.android_kotlin_two_dop.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android_kotlin_two_dop.R
import com.example.android_kotlin_two_dop.databinding.FragmentOnBoardBinding
import com.example.android_kotlin_two_dop.ui.adapter.Adapter
import com.google.android.material.tabs.TabLayoutMediator

class OnBoardFragment : Fragment() {

    private lateinit var binding: FragmentOnBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOnBoardBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        binding.viewPager.adapter = Adapter(this@OnBoardFragment)
        TabLayoutMediator(binding.layout, binding.viewPager) { _, _ ->
        }.attach()
    }

    private fun initialize() {
        binding.viewPager.adapter = Adapter(this@OnBoardFragment)
    }
}
