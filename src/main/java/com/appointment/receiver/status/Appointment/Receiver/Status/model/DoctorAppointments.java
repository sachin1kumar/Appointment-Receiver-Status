package com.appointment.receiver.status.Appointment.Receiver.Status.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity(name = "doctor_appointments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class DoctorAppointments {

    @Id
    private BigInteger doctor_id;
    private boolean enable_disable;
    private BigInteger appointment_limit;
    private BigInteger next_appointment_limit;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date appointment_date;

    public DoctorAppointments() {

    }

    public boolean isEnable_disable() {
        return enable_disable;
    }

    public void setEnable_disable(boolean enable_disable) {
        this.enable_disable = enable_disable;
    }

    public BigInteger getAppointment_limit() {
        return appointment_limit;
    }

    public void setAppointment_limit(BigInteger appointment_limit) {
        this.appointment_limit = appointment_limit;
    }

    public BigInteger getNext_appointment_limit() {
        return next_appointment_limit;
    }

    public void setNext_appointment_limit(BigInteger next_appointment_limit) {
        this.next_appointment_limit = next_appointment_limit;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public BigInteger getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(BigInteger doctor_id) {
        this.doctor_id = doctor_id;
    }
}
