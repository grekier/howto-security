package com.help.howtosecurity.controller

import com.help.howtosecurity.service.DummyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/securebasic")
class ControllerSecureBasic(
    private val dummyService: DummyService
) {

    @GetMapping
    fun profile(): Mono<String> {
        return Mono.just( dummyService.dummyCall("secure HttpBasic") )
    }
}