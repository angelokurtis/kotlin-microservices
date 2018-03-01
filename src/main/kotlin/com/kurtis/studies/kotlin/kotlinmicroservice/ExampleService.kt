package com.kurtis.studies.kotlin.kotlinmicroservice

import org.springframework.stereotype.Service

@Service
class ExampleService {
    fun getHello(name: String) = "hello $name"
}