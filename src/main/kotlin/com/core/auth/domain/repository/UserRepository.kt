package com.core.auth.domain.repository

import com.core.auth.domain.model.User

interface UserRepository {
    fun signUp()

    fun findByEmail(email: String) : User
}