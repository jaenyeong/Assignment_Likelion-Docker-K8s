package com.jaenyeong.movieapi.service

import com.jaenyeong.movieapi.dto.MovieRequestDto
import com.jaenyeong.movieapi.dto.MovieResponseDto
import com.jaenyeong.movieapi.repository.MovieRepository
import org.springframework.stereotype.Service
import javax.transaction.Transactional

@Service
@Transactional
class MovieService(private val movieRepository: MovieRepository) {
    fun getMovies(): List<MovieResponseDto> {
        return movieRepository.findAll().map { MovieResponseDto(it) }
    }

    fun getMovieBy(id: Long): MovieResponseDto =
        run { MovieResponseDto(movieRepository.findById(id).get()) }

    fun insertMovie(newMovie: MovieRequestDto): MovieResponseDto =
        runCatching {
            MovieResponseDto(movieRepository.save(newMovie.toMovie()))
        }.getOrElse {
            throw it
        }

    fun updateMovie(id: Long, updateMovie: MovieRequestDto) {
        val findMovie = movieRepository.findById(id).get()
        findMovie.name = updateMovie.name
        findMovie.releasedDt = updateMovie.releasedDt
    }

    fun deleteMovieBy(id: Long) =
        runCatching {
            movieRepository.deleteById(id)
        }.getOrElse {
            throw it
        }
}

