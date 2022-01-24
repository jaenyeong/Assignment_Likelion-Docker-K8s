package com.jaenyeong.movieapi.dto

import com.jaenyeong.movieapi.entity.Movie
import java.time.LocalDate

data class MovieResponseDto(
    private val movie: Movie,
    val id: Long = movie.id!!,
    val name: String = movie.name,
    val releasedDt: LocalDate = movie.releasedDt
)
