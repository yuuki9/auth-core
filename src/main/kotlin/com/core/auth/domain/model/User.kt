package com.core.auth.domain.model

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import java.time.LocalDateTime

class User(
    val idx: Long? = null,
    val nickName: String,
    val email: String,
    private val encodedPassword: String,
    val createAt: LocalDateTime,
    val isActive: Boolean,
    val isLocked: Boolean,
    val failedLoginCount: Int,
    val passwordChangedAt: LocalDateTime? = null
) {
    object PasswordEncoderProvider {
        val instance: PasswordEncoder = BCryptPasswordEncoder()
    }
    fun checkPassword(input: String): Boolean {
        return PasswordEncoderProvider.instance.matches(input, encodedPassword)
    }
}


