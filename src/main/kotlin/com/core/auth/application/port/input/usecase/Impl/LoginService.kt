package com.core.auth.application.port.input.usecase.Impl

import com.core.auth.application.port.input.command.LoginCommand
import com.core.auth.application.port.input.usecase.LoginUseCase
import org.springframework.stereotype.Service

@Service
class LoginService(
    //private val
) : LoginUseCase{
    override fun login(command: LoginCommand) {

    }
}