package com.example.wimel.foodmarketkotlin.ui.auth.signin

import com.example.wimel.foodmarketkotlin.base.BasePresenter
import com.example.wimel.foodmarketkotlin.base.BaseView
import com.example.wimel.foodmarketkotlin.model.response.login.LoginResponse

interface SigninContract {

    interface View: BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message:String)

    }

    interface Presenter : SigninContract, BasePresenter {
        fun subimtLogin(email:String, password:String)
    }
}