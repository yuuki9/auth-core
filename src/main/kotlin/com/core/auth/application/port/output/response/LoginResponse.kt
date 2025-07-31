package com.core.auth.application.port.output.response

data class LoginResponse (
    val email : String,
    val nickName : String,
    val role : String
)