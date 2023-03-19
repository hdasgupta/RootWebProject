package com.root.dto

class URLDto(val text:String) {
    val url: String = "http://localhost:${getPort()}"
    private companion object {
        private var port:Int = 0

        private fun getPort():Int {
            port+=100
            return port
        }
    }
}