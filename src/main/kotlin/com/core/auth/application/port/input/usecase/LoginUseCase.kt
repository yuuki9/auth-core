package com.core.auth.application.port.input.usecase

import com.core.auth.application.port.input.command.LoginCommand

interface LoginUseCase {
    fun login(command : LoginCommand)
}