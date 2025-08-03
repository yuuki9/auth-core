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
    override fun save(email: String) {
        TODO("Not yet implemented")
    }
}