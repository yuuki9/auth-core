package com.core.auth.application.port.input.usecase.Impl

import com.core.auth.application.mapper.UserMapper
import com.core.auth.application.port.input.command.LoginCommand
import com.core.auth.application.port.input.usecase.LoginUseCase
import com.core.auth.domain.repository.UserRepository
import com.core.auth.domain.validator.UserPolicyValidator
import org.springframework.stereotype.Service

@Service
class LoginService(
    private val userRepository: UserRepository,
    private val userPolicyValidator: UserPolicyValidator
) : LoginUseCase{
    override fun login(command: LoginCommand) {
       val user =  userRepository.findByEmail(command.email)
        //회원조회 예외처리
        userPolicyValidator.loginValidator(user , command.encodedPassword)
        TODO("로그인 성공 처리")
    }
}