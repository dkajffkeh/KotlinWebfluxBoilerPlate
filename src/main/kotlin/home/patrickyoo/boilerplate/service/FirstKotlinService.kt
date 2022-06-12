package home.patrickyoo.boilerplate.service

import home.patrickyoo.boilerplate.common.log.logger
import org.springframework.stereotype.Service

@Service
class FirstKotlinService {

    private val log = logger();

    fun helloWorld() = "Hello World";
}