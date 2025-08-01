package com.core.auth.application.port.input.usecase.Impl

import com.core.auth.application.mapper.UserMapper
import com.core.auth.application.port.input.command.LoginCommand
import com.core.auth.application.port.input.usecase.LoginUseCase
import com.core.auth.application.port.output.UserRoleRepository
import com.core.auth.application.port.output.response.LoginResponse
import com.core.auth.domain.repository.UserRepository
import com.core.auth.domain.validator.UserPolicyValidator
import org.springframework.stereotype.Service

@Service
class LoginService(
    private val userRepository: UserRepository,
    private val userRoleRepository : UserRoleRepository,
    private val userPolicyValidator: UserPolicyValidator
) : LoginUseCase{
    override fun login(command: LoginCommand) : LoginResponse {
       val user =  userRepository.findByEmail(command.email)
       val role = userRoleRepository.findByUser(user)
        //회원조회 예외처리
        userPolicyValidator.loginValidator(user , command.encodedPassword)
        //로그인 성공 처리

        return LoginResponse(
            email = user.email,
            nickName = user.nickName,
            role = role.role.name
        )
    }
}