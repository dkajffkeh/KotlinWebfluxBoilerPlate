package home.patrickyoo.boilerplate.controller

import home.patrickyoo.boilerplate.service.FirstKotlinService
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstKotlinController (val firstKotlinService: FirstKotlinService){

    @GetMapping("/")
    suspend fun helloWorld() : String {
        return firstKotlinService.helloWorld();
    }
}