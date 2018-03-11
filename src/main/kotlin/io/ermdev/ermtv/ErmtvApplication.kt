package io.ermdev.ermtv

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ErmtvApplication

fun main(args: Array<String>) {
    SpringApplication.run(ErmtvApplication::class.java, *args)
}
