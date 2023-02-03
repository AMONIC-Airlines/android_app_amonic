package com.example.amonic.models

class CountryModel(private var id: Int, private var name: String) {
    override fun toString(): String {
        return "CountryModel(id=$id, name='$name')"
    }
}