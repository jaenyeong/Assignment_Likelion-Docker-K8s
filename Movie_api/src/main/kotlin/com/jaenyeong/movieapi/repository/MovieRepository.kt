package com.jaenyeong.movieapi.repository

import com.jaenyeong.movieapi.entity.Movie
import org.springframework.data.jpa.repository.JpaRepository

interface MovieRepository : JpaRepository<Movie, Long>
