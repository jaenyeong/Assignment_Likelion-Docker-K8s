package com.jaenyeong.movieapi.dto

import com.jaenyeong.movieapi.entity.Movie
import java.time.LocalDate

data class MovieRequestDto(val name: String, val releasedDt: LocalDate) {
    fun toMovie(): Movie {
        return Movie(name = name, releasedDt = releasedDt)
    }
}
