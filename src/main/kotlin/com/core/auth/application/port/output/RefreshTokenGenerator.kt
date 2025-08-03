package com.core.auth.application.port.output

interface RefreshTokenGenerator {
    fun generate(email : String) : String
}