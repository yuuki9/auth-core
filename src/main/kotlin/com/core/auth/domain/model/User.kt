package com.core.auth.domain.model

import java.time.LocalDateTime

class User(
    val idx: Long? = null,
    val nickName: String,
    val email: String,
    val encodedPassword: String,
    val createAt: LocalDateTime,
    val isActive: Boolean,
    val isLocked: Boolean,
    val failedLoginCount: Int,
    val passwordChangedAt: LocalDateTime? = null
)