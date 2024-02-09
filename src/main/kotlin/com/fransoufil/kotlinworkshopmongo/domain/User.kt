package com.fransoufil.kotlinworkshopmongo.domain

import java.io.Serializable

class User: Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    var id: String? = null
    var name: String? = null
    var email: String? = null

    constructor(id: String?, name: String?, email: String?) {
        this.id = id
        this.name = name
        this.email = email
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

    override fun toString(): String {
        return "User(id=$id, name=$name, email=$email)"
    }

}