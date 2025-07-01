package com.core.auth.domain.repository

interface UserRepository {
    fun signUp()
    fun getUserList()
    fun getUserDetail(idx : Long)
}