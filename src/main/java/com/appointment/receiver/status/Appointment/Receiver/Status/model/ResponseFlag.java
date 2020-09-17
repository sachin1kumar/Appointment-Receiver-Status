package com.appointment.receiver.status.Appointment.Receiver.Status.model;

public class ResponseFlag {

    private boolean isSlotAvailable;

    public ResponseFlag() {

    }

    public boolean isSlotAvailable() {
        return isSlotAvailable;
    }

    public void setSlotAvailable(boolean slotAvailable) {
        isSlotAvailable = slotAvailable;
    }
}
