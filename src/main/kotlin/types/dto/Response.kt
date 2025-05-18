package org.example.types.dto

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class Response<T>(
    val resultCode: Int,
    val message: String,
    val result: T?,
    val responseTime: String = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
)