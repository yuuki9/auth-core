package com.core.auth.adapter.port.input.web.request

import com.core.auth.application.port.input.command.LoginCommand
import com.core.auth.application.port.input.command.SignUpCommand

data class LoginRequest(
    val email : String,
    val password : String
) {
    fun toCommand(): LoginCommand {
        return LoginCommand(
            email = email,
            encodedPassword = password
        )
    }
}
