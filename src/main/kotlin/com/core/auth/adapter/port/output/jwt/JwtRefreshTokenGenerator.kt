package com.core.auth.adapter.port.output.jwt

import com.core.auth.application.port.output.RefreshTokenGenerator
import io.jsonwebtoken.Header
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.SignatureAlgorithm
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.time.Instant
import java.util.*

@Component
class JwtRefreshTokenGenerator(
    @Value("\${jwt.secret}") private val secretKey: String,
    @Value("\${jwt.expiration-minutes}") private val expirationMinutes: Long
) : RefreshTokenGenerator {
    //jwt 리프레쉬 토큰 생성 로직 추가
    override fun generate(email: String): String {
        val now = Instant.now()
        val expiryDate = now.plusSeconds(expirationMinutes * 60)
        val payload = mapOf(
            "type" to "ACCESS"
        )

        return Jwts.builder()
            .setHeaderParam(Header.TYPE, Header.JWT_TYPE) //헤더
            .setSubject(email) // 토큰 주체(사용자 식별자)
            .setIssuedAt(Date.from(now))  // 발급 시각
            .addClaims(payload) // 페이로드
            .setExpiration(Date.from(expiryDate)) // 만료 시각
            .signWith(SignatureAlgorithm.HS256, secretKey) // 서명
            .compact()
    }

}