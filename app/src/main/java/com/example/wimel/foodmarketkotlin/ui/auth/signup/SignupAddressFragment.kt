package com.example.wimel.foodmarketkotlin.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.wimel.foodmarketkotlin.R
import com.example.wimel.foodmarketkotlin.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signup_address.*

class SignupAddressFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup_address, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnSignUpNow.setOnClickListener {
            Navigation.findNavController(it)
                .navigate(R.id.action_signupsuccess, null)

            (activity as AuthActivity).toolbarSignUpSuccess()
        }
    }
}