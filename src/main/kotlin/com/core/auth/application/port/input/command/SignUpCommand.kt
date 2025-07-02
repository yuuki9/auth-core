package com.core.auth.application.port.input.command

data class SignUpCommand(
    val email : String,
    val nickName: String,
    val encodedPassword: String,
)
