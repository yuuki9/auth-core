package com.core.auth.application.mapper

import com.core.auth.application.port.input.command.SignUpCommand
import com.core.auth.domain.model.User
import java.time.LocalDateTime

class UserMapper {
    fun toDomain(cmd : SignUpCommand) : User {
        return User(
            idx = null,
            email = cmd.email,
            nickName = cmd.nickName,
            encodedPassword = cmd.encodedPassword,
            createAt = LocalDateTime.now(),
            isActive = false,
            isLocked = false,
            failedLoginCount = 0
        )
    }
}