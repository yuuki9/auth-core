package com.core.auth.domain.validator

import com.core.auth.domain.model.User

interface LoginPolicyValidator {
    fun longinValidator(user: User, password : String)
}
