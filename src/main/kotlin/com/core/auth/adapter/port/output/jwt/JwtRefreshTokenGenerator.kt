package com.core.auth.adapter.port.output.jwt

import com.core.auth.application.port.output.RefreshTokenGenerator
import org.springframework.stereotype.Component

@Component
class JwtRefreshTokenGenerator(
) : RefreshTokenGenerator{
    override fun generate(email: String) : String {
        //jwt 리프레쉬 생성 로직 추가
        TODO("Not yet implemented")
    }
}