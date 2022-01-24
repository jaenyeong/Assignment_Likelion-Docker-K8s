package com.jaenyeong.movieapi.controller

import com.jaenyeong.movieapi.dto.MovieRequestDto
import com.jaenyeong.movieapi.dto.MovieResponseDto
import com.jaenyeong.movieapi.dto.ResponseDto
import com.jaenyeong.movieapi.service.MovieService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR
import org.springframework.http.HttpStatus.NOT_FOUND
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/movies")
class MovieController(private val movieService: MovieService) {
    @GetMapping("/health")
    fun healthCheck(): ResponseDto<String> =
        ResponseDto(data = "Hello")

    @GetMapping("")
    fun getMovies(): ResponseDto<List<MovieResponseDto>> =
        runCatching {
            ResponseDto(data = movieService.getMovies())
        }.getOrElse {
            ResponseDto(httpStatus = NOT_FOUND)
        }

    @GetMapping("/{id}")
    fun getMovieBy(@PathVariable id: Long): ResponseDto<MovieResponseDto> =
        ResponseDto(data = movieService.getMovieBy(id))

    @PostMapping("")
    fun insertMovie(@RequestBody newMovie: MovieRequestDto): ResponseDto<MovieResponseDto> =
        runCatching {
            ResponseDto(httpStatus = CREATED, data = movieService.insertMovie(newMovie))
        }.getOrElse {
            ResponseDto(httpStatus = INTERNAL_SERVER_ERROR)
        }

    @PutMapping("/{id}")
    fun updateMovie(@PathVariable id: Long, @RequestBody updateMovie: MovieRequestDto): ResponseDto<Unit> =
        runCatching {
            ResponseDto(data = movieService.updateMovie(id = id, updateMovie = updateMovie))
        }.getOrElse {
            ResponseDto(httpStatus = INTERNAL_SERVER_ERROR, data = Unit)
        }

    @DeleteMapping("/{id}")
    fun deleteMovie(@PathVariable id: Long): ResponseDto<Unit> =
        runCatching {
            ResponseDto(data = movieService.deleteMovieBy(id))
        }.getOrElse {
            ResponseDto(httpStatus = INTERNAL_SERVER_ERROR, data = Unit)
        }
}
