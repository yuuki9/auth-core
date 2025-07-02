package com.core.auth.adapter.port.input.web.request

import com.core.auth.application.port.input.command.SignUpCommand

data class SignUpRequest(
    val email: String,
    val nickName: String,
    val password: String
) {
    fun toCommand(): SignUpCommand {
        return SignUpCommand(
            email = email,
            nickName = nickName,
            encodedPassword = password
        )
    }
}
