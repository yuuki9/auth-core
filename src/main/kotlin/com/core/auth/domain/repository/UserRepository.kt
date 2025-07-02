package com.core.auth.domain.repository

interface UserRepository {
    fun signUp()

    fun login()
}