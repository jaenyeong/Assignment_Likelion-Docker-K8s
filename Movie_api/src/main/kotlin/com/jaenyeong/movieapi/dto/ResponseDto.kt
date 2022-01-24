package com.jaenyeong.movieapi.dto

import org.springframework.http.HttpStatus
import java.time.LocalDateTime

data class ResponseDto<T>(
    val httpStatus: HttpStatus = HttpStatus.OK,
    val responseDateTime: LocalDateTime = LocalDateTime.now(),
    val data: T? = null
)
