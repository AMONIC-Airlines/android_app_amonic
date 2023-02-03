package com.example.amonic.models

class TicketModel(
    private var id: Int,
    private var userId: Int,
    private var scheduleId: Int,
    private var cabinTypeId: Int,
    private var firstname: String,
    private var lastname: String,
    private var email: String,
    private var phone: String,
    private var passportNumber: String,
    private var passportCountryId: Int,
    private var bookingReference: String,
    private var confirmed: Boolean
) {
    override fun toString(): String {
        return "TicketModel(id=$id," +
                " userId=$userId," +
                " scheduleId=$scheduleId," +
                " cabinTypeId=$cabinTypeId," +
                " firstname='$firstname'," +
                " lastname='$lastname'," +
                " email='$email'," +
                " phone='$phone'," +
                " passportNumber='$passportNumber'," +
                " passportCountryId=$passportCountryId," +
                " bookingReference='$bookingReference'," +
                " confirmed=$confirmed)"
    }
}