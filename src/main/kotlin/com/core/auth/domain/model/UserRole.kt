package com.core.auth.domain.model

class UserRole (
    val idx : Long? = null,
    val user : User,
    val role : RoleType
)

enum class RoleType {
    USER, //일반사용자
    ADMIN, //관리자
}