package com.example.amonic.models

class AirportModel(
    private var id: Int,
    private var countryId: Int,
    private var code: String,
    private var name: String
) {
    override fun toString(): String {
        return "AirportModel(id=$id," +
                " countryId=$countryId," +
                " code='$code'," +
                " name='$name')"
    }
}