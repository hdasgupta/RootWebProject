package com.root

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class HDGatewayApplication

fun main(vararg args: String) {
    runApplication<HDGatewayApplication>(*args)
}