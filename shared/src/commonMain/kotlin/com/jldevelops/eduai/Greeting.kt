package com.jldevelops.eduai

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Test Multiplatform, ${platform.name}!"
    }
}