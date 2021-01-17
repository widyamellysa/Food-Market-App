package com.example.wimel.foodmarketkotlin.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wimel.foodmarketkotlin.R
import com.example.wimel.foodmarketkotlin.ui.MainActivity
import com.example.wimel.foodmarketkotlin.ui.auth.AuthActivity
import kotlinx.android.synthetic.main.fragment_signin.*

class SigninFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signin, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        btnSignup.setOnClickListener {
            val signup = Intent(activity, AuthActivity::class.java)
            signup.putExtra("page_request",2)
            startActivity(signup)
        }

        btnSignin.setOnClickListener {
            val signup = Intent(activity, MainActivity::class.java)
            startActivity(signup)
            activity?.finish()
        }

    }
}