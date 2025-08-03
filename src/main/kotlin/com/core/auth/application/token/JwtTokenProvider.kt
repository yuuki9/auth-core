package com.core.auth.application.token

interface JwtTokenProvider {
    fun generate(email : String) : String
}