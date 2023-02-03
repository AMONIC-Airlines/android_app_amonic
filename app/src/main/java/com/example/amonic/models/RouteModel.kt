package com.example.amonic.models

class RouteModel(
    private var id: Int,
    private var departureAirportId: Int,
    private var arrivalAirportId: Int,
    private var distance: Int,
    private var flightTime: Int
) {
    override fun toString(): String {
        return "RouteModel(id=$id," +
                " departureAirportId=$departureAirportId," +
                " ArrivalAirportId=$arrivalAirportId," +
                " Distance=$distance," +
                " FlightTime=$flightTime)"
    }
}