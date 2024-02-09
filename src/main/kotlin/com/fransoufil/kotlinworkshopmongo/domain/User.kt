package com.fransoufil.kotlinworkshopmongo.domain

import java.io.Serializable

class User: Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    private var id: String? = null
    private var name: String? = null
    private var email: String? = null
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