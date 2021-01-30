package com.example.wimel.foodmarketkotlin.ui.auth.signup

import android.net.Uri
import com.example.wimel.foodmarketkotlin.base.BasePresenter
import com.example.wimel.foodmarketkotlin.base.BaseView
import com.example.wimel.foodmarketkotlin.model.request.RegisterRequest
import com.example.wimel.foodmarketkotlin.model.response.login.LoginResponse

interface SignupContract {

    interface View: BaseView {
        fun onRegisterSuccess(loginResponse: LoginResponse, view:android.view.View)
        fun onRegisterPhotoSuccess(view:android.view.View)
        fun onRegisterFailed(message:String)

    }

    interface Presenter : SignupContract, BasePresenter {
        fun submitRegister(registerRequest: RegisterRequest, view:android.view.View)
        fun submitPhotoRegister(filePath: Uri, view:android.view.View)
    }
}