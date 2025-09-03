package com.core.auth.domain.validator.Impl

import com.core.auth.domain.model.User
import com.core.auth.domain.validator.LoginPolicyValidator
import org.springframework.stereotype.Service
import java.util.function.LongToIntFunction

@Service
class LoginPolicyValidatorImpl () : LoginPolicyValidator{
    override fun longinValidator(user: User, password: String) {
        TODO("로그인 도메인 검증 정책을 추가")
    }
}