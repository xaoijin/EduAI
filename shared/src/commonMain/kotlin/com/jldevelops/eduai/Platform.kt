package com.jldevelops.eduai

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform