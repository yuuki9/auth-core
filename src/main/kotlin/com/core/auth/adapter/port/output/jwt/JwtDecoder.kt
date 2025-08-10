package com.core.auth.adapter.port.output.jwt

import com.core.auth.adapter.port.output.redis.model.RefreshToken
import io.jsonwebtoken.Jwts
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import java.util.stream.Collectors

interface JwtDecoder {
    fun decode(token: String): Map<String, String>
}

@Component
class JwtDecoderImpl(
    @Value("\${jwt.secret}") private val secretKey: String,
    @Value("\${jwt.expiration-minutes}") private val expirationMinutes: Long
) : JwtDecoder {

    override fun decode(token: String): Map<String, String> {
        return Jwts.parser()
            .setSigningKey(secretKey)
            .parseClaimsJws(token)
            .body
            .entries
            .stream()
            .collect(Collectors.toMap(
                { it.key },
                { it.value.toString() }
            ))
    }
}