package com.core.auth.application.port.input.usecase.Impl

import com.core.auth.application.port.input.command.SignUpCommand
import com.core.auth.application.port.input.usecase.SignUpUseCase
import org.springframework.stereotype.Service

@Service
class SignUpService(): SignUpUseCase {
    override fun signUp(command: SignUpCommand) {
        TODO("Not yet implemented")
    }

}