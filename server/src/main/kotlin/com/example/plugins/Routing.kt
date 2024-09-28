package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Ana Pupo, Eliharison, Ana Lima, Renato Hioji Okamoto Odake, Lauro, Nicolle, Letícia, Gabriel, Vini Gomes, Asher")
        }
    }
}
