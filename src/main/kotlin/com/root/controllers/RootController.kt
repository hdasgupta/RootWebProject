package com.root.controllers

import com.root.dto.URLDto
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class RootController {

    val appsString:List<String> = ("waveModulation booleanAlgebra " +
            "crossWord progression mathLang TicTacToe boxAuto " +
            "PermutationAndCombination").split(' ')

    val apps: List<URLDto>
        get() = appsString
                    .map {
                        it.replaceRange(0..0, it[0].uppercase())
                            .replace(Regex("[A-Z]"), fun(match:MatchResult) = " "+match.value)
                            .trim()
                    }
                    .map {
                        URLDto(it)
                    }
    

    @GetMapping(value = ["", "/", "/index.htm", "/index.html", "/index"])
    fun index(map:ModelMap):String {
        map["apps"] = apps

        return "Index"
    }
}