package com.core.auth.adapter.port.output.jwt

import com.core.auth.application.port.output.AccessTokenGenerator
import org.springframework.stereotype.Component

@Component
class JwtAccessTokenGenerator() : AccessTokenGenerator{
    override fun generate(email: String): String {
        //jwt 엑세스 토큰 생성 로직 추가
        //기존에 재발급토큰이 존재하였는지 검사합니다.
        TODO("Not yet implemented")
    }
}