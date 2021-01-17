package com.example.wimel.foodmarketkotlin.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wimel.foodmarketkotlin.R
import com.example.wimel.foodmarketkotlin.model.dummy.HomeModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), HomeAdapter.ItemAdapterCallback {

    private var foodList : ArrayList<HomeModel> = ArrayList()

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val root = inflater.inflate(R.layout.fragment_home, container, false)
    return root
  }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeAdapter(foodList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter

        val sectionPagerAdapter = SectionPagerAdapter(
            childFragmentManager
        )
        viewPager.adapter = sectionPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeModel("Cherry Healthy","",5f))
        foodList.add(HomeModel("Burger Tamayo","",4f))
        foodList.add(HomeModel("Bakhwan Cihuy","",4.5f))

    }

    override fun onClick(v: View, data: HomeModel) {
        Toast.makeText(context, "test click", Toast.LENGTH_LONG).show()
    }
}