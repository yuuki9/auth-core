package com.core.auth.adapter.port.input.web.controller

import com.core.auth.adapter.port.input.web.request.LoginRequest
import com.core.auth.adapter.port.input.web.request.SignUpRequest
import com.core.auth.application.port.input.usecase.LoginUseCase
import com.core.auth.application.port.input.usecase.SignUpUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController (
    private val signUpUseCase: SignUpUseCase,
    private val loginUseCase: LoginUseCase
){
    @PostMapping("/login")
    fun login(@RequestBody request: LoginRequest) {
        loginUseCase.login(request.toCommand())
    }

    @PostMapping("/signUp")
    fun signUp(@RequestBody request: SignUpRequest) {
        signUpUseCase.signUp(request.toCommand())
    }
}