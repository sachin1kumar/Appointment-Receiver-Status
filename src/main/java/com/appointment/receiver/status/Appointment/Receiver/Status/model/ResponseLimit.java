package com.get.appointment.limit.GetAppointmentLimit.model;

import java.math.BigInteger;

public class ResponseLimit {

    private BigInteger appointment_limit;

    public ResponseLimit() {

    }

    public BigInteger getAppointment_limit() {
        return appointment_limit;
    }

    public void setAppointment_limit(BigInteger appointment_limit) {
        this.appointment_limit = appointment_limit;
    }
}
