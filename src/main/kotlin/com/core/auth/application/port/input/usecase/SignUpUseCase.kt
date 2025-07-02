package com.core.auth.application.port.input.usecase

import com.core.auth.application.port.input.command.SignUpCommand

interface SignUpUseCase {
    fun signUp(command : SignUpCommand)
}