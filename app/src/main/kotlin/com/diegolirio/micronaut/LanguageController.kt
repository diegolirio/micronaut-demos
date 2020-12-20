package com.diegolirio.micronaut

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpResponse

@Controller("/languages")
open class LanguageController {

    @Get("/")
    open fun get(): HttpResponse<*> {
        val list = listOf("Java", "C#", "Python");
        return HttpResponse.ok<List<String>>(list)
    }
}