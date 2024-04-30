package org.example.howto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HowToApplication

fun main(args: Array<String>) {
	runApplication<HowToApplication>(*args)
}
