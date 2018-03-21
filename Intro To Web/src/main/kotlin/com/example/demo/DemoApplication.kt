package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication

// Our app will start running from here
fun main(args: Array<String>) {
    SpringApplication.run(DemoApplication::class.java, *args)
}
