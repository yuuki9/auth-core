package com.core.auth.domain.validator

import com.core.auth.domain.model.User

interface UserPolicyValidator {
    fun userValidator(user: User , password : String)
    //fun signUpValidator()
}