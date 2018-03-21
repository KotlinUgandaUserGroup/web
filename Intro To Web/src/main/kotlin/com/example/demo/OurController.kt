package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class OurController(var ourModel: OurModel) {

    @RequestMapping("/")
    fun home(model:Model): String {
        model.addAttribute("students", ourModel.students())
        return "home"
    }

    @RequestMapping("/contact")
    fun contact(): String {
        return "contact"
    }

    @RequestMapping("/about")
    fun about(): String {
        return "about"
    }
}