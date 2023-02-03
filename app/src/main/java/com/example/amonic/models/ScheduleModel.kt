package com.example.amonic.models

import java.util.*

class ScheduleModel(
    private var id: Int,
    private var date: Date,
    private var time: Date,
    private var aircraftId: Int,
    private var routeId: Int,
    private var economyPrice: Double,
    private var confirmed: Boolean,
    private var flightNumber: Boolean
) {
    override fun toString(): String {
        return "ScheduleModel(id=$id," +
                " date=$date," +
                " time=$time," +
                " aircraftId=$aircraftId," +
                " routeId=$routeId," +
                " economyPrice=$economyPrice," +
                " confirmed=$confirmed," +
                " flightNumber=$flightNumber)"
    }
}