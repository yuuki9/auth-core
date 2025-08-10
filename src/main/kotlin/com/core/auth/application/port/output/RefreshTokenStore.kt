package com.core.auth.application.port.output

interface RefreshTokenStore {
    fun save(email: String, token: String)
}