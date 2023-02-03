package com.example.amonic.models

class AircraftModel(
    private var id: Int,
    private var name: String,
    private var makeModel: String,
    private var totalSeats: Int,
    private var economySeats: Int,
    private var businessSeats: Int
) {
    override fun toString(): String {
        return "AircraftModel(id=$id," +
                " name='$name'," +
                " makeModel='$makeModel'," +
                " totalSeats=$totalSeats," +
                " economySeats=$economySeats," +
                " businessSeats=$businessSeats)"
    }
}