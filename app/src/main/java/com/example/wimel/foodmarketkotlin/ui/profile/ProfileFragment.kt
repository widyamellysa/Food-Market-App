package com.example.wimel.foodmarketkotlin.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wimel.foodmarketkotlin.R
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment() {

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_profile, container, false)
    return root
  }

  override fun onActivityCreated(savedInstanceState: Bundle?) {
    super.onActivityCreated(savedInstanceState)

    val sectionPagerAdapter = SectionPagerAdapter(
      childFragmentManager
    )
    viewPager.adapter = sectionPagerAdapter
    tabLayout.setupWithViewPager(viewPager)
  }
}