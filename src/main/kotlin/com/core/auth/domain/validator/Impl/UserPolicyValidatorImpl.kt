package com.core.auth.domain.validator.Impl

import com.core.auth.domain.model.User
import com.core.auth.domain.repository.UserRepository
import com.core.auth.domain.validator.UserPolicyValidator

class UserPolicyValidatorImpl (private val userRepository: UserRepository) : UserPolicyValidator {
    override fun loginValidator(user: User, password : String) {
        if (!user.checkPassword(password)) {
            TODO("비밀번호가 일치하지 않습니다")
        }
        if (!user.isActive) {
            TODO("비활성 사용자 입니다")
        }
    }



}