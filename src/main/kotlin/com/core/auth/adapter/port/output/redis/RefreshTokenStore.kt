package com.core.auth.adapter.port.output.redis

import com.core.auth.adapter.port.output.redis.model.RefreshToken
import com.core.auth.application.port.output.RefreshTokenStore
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component

interface RedisRefreshTokenRepository : CrudRepository<RefreshToken, String>

@Component
class RefreshTokenStore(
    private val repository: RedisRefreshTokenRepository
) : RefreshTokenStore {
    override fun save(email: String, token: String) {
        //실제 레디스에 저장 구현
        val refreshToken = RefreshToken(
            id = email,
            token = token,
            timeToLive = 15,
        )
        repository.save(refreshToken)
    }
}