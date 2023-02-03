package com.example.amonic.models

import java.util.*

class UserModel(
    private var id: Int,
    private var email: String,
    private var firstname: String,
    private var lastname: String,
    private var birthday: Date,
    private var token: String
) {
    override fun toString(): String {
        return "UserModel(id=$id, " +
                "email='$email', " +
                "firstname='$firstname', " +
                "lastname='$lastname', " +
                "birthday=$birthday, " +
                "token='$token')"
    }
}