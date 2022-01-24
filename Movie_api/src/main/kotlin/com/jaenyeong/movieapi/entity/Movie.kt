package com.jaenyeong.movieapi.entity

import org.hibernate.annotations.DynamicUpdate
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType.IDENTITY
import javax.persistence.Id

@Entity
@DynamicUpdate
class Movie(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    val id: Long? = null,
    var name: String,
    var releasedDt: LocalDate = LocalDate.now()
)
