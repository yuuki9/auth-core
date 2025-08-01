package com.core.auth.adapter.port.output.redis.model

import jakarta.persistence.Id
import org.springframework.data.redis.core.RedisHash
import org.springframework.data.redis.core.TimeToLive
import java.util.concurrent.TimeUnit

@RedisHash("refresh-token")
data class RefreshToken (
    @Id val id: String,
    val token: String,
    @TimeToLive(unit = TimeUnit.SECONDS)
    val timeToLive: Long
)