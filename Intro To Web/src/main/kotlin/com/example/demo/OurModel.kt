package com.example.demo

import org.springframework.stereotype.Repository

@Repository
class OurModel(){

    fun students(): List<String> {
        val s = listOf<String>("John", "Andrew", "Clinton")
        return s
    }
}