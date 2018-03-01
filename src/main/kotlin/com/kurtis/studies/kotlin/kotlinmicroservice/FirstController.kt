package com.kurtis.studies.kotlin.kotlinmicroservice

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController(val exampleService: ExampleService) {
    @RequestMapping(value = ["/user/{name}"], method = [(RequestMethod.GET)])
    fun hello(@PathVariable name: String) = exampleService.getHello(name)
}