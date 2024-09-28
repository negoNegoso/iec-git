package com.example.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Ana Pupo, Asher, Eliharison, Gabriel, Gustavo, Éder, Henry, Letícia, Lucas, Matheus, Rodrigo Lindo, Renato Hioji OKamoto odake, Saulo de Freitas")

        }
    }
}
