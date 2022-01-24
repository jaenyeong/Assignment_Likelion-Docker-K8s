package com.jaenyeong.movieui.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

@CrossOrigin
@Controller
class MovieController {

    @GetMapping("/health")
    @ResponseBody
    fun healthCheck(): ResponseEntity<String> =
        ResponseEntity.ok("Hello")

    @GetMapping("")
    fun index(): String = "index"

    @GetMapping("/about")
    fun about(): String = "about"

    @GetMapping("/upload")
    fun upload(): String = "upload"

    @GetMapping("/detail/{id}")
    fun detail(@PathVariable id: Long): String = "detail"
}
