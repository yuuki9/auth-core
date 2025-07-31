package com.core.auth.application.port.input.usecase

import com.core.auth.application.port.input.command.LoginCommand
import com.core.auth.application.port.output.response.LoginResponse

interface LoginUseCase {
    fun login(command : LoginCommand) : LoginResponse
}