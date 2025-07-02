package com.core.auth.application.port.output

import com.core.auth.domain.model.User

interface UserRepository {
    fun login(email : String, password : String) : User
    fun signUp(user : User) : User
}