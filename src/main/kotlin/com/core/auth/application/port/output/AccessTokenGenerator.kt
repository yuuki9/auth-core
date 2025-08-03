package com.core.auth.application.port.output

interface AccessTokenGenerator {

    fun generate(email : String) : String
}