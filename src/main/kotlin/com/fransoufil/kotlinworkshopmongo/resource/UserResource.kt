package com.fransoufil.kotlinworkshopmongo.resource

import com.fransoufil.kotlinworkshopmongo.domain.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource {

    @GetMapping
    fun findAll(): ResponseEntity<List<User>> {

        val francisco = User("1", "Francisco Souza", "francisco@souza.com")
        val ana = User("2", "Ana Clara", "ana@clara.com")

        val list: List<User> = ArrayList(listOf(francisco, ana))

        return ResponseEntity.ok(list)
    }
}