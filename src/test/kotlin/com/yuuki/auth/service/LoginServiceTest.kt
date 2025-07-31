package com.yuuki.auth.service

import com.core.auth.application.port.input.usecase.Impl.LoginService
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LoginServiceTest {
    private lateinit var target: LoginService
    @BeforeEach
    fun setUp () {
        target = LoginService()
    }


    @Test @DisplayName("LoginService - 로그인 성공테스트")
    fun login_positive() {
        //given

        //when
        //then
    }
}