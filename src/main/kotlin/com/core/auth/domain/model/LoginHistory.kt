package com.core.auth.domain.model

import java.time.LocalDateTime

class LoginHistory (
    val idx : Long,
    val user : User,
    val accessIp : String,
    val lastLoginAt: LocalDateTime? = null,
)