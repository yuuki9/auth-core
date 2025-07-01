package com.core.auth.domain.model

class Role (
    val idx : Long? = null,
    val role : RoleType
)

enum class RoleType {
    USER, //일반사용자
    ADMIN, //관리자
}