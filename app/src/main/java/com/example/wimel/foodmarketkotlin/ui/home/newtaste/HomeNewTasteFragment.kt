package com.example.wimel.foodmarketkotlin.ui.home.newtaste

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wimel.foodmarketkotlin.R
import com.example.wimel.foodmarketkotlin.model.dummy.HomeVerticalModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeNewTasteFragment : Fragment(), HomeNewTasteAdapter.ItemAdapterCallback {

    private var foodList : ArrayList<HomeVerticalModel> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_new_taste, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        initDataDummy()
        var adapter = HomeNewTasteAdapter(foodList, this)
        var layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(activity)
        rcList.layoutManager = layoutManager
        rcList.adapter = adapter
    }

    fun initDataDummy() {
        foodList = ArrayList()
        foodList.add(HomeVerticalModel("Cherry Healthy","10000","",5f))
        foodList.add(HomeVerticalModel("Burger Tamayo","50000","",4f))
        foodList.add(HomeVerticalModel("Bakhwan Cihuy","70000","",4.5f))

    }

    override fun onClick(v: View, data: HomeVerticalModel) {
        Toast.makeText(context, "Percobaan klik item"+data.title,  Toast.LENGTH_SHORT).show()
    }

}