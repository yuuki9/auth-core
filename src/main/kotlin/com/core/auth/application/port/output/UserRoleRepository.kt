package com.core.auth.application.port.output

import com.core.auth.domain.model.User
import com.core.auth.domain.model.UserRole

interface UserRoleRepository {
    fun findByUser(user : User) : UserRole
}