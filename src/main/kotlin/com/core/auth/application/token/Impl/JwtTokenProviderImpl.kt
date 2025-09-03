package com.core.auth.application.token.Impl

import com.core.auth.application.port.output.AccessTokenGenerator
import com.core.auth.application.port.output.RefreshTokenGenerator
import com.core.auth.application.port.output.RefreshTokenStore
import com.core.auth.application.token.JwtTokenProvider
import org.springframework.stereotype.Component

@Component
class JwtTokenProviderImpl(
    private val accessTokenGenerator: AccessTokenGenerator,
    private val refreshTokenGenerator: RefreshTokenGenerator,
    private val refreshTokenStore: RefreshTokenStore
): JwtTokenProvider {
    override fun generate(email: String) : String {
        //리프레쉬 토큰이 다르면 다시 생성

        //
        val accessToken = accessTokenGenerator.generate(email)
        val refreshToken = refreshTokenGenerator.generate(email)
        //refreshTokenStore.save(refreshToken)
        return accessToken
    }


}