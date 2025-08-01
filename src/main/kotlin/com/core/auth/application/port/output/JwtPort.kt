package com.core.auth.application.port.output

interface JwtPort {
    fun generateAccessToken(userId: Long, roles: List<String>): String
    fun validateToken(token: String): Boolean
    fun getUserIdFromToken(token: String): Long
}