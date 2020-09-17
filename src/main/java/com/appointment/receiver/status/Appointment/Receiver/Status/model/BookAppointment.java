package com.appointment.receiver.status.Appointment.Receiver.Status.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;


@Entity(name = "patient_records")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class BookAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger booking_id;
    private BigInteger doctor_id;
    private BigInteger patient_id;

    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date appointment_date;

    private String status;

    @JsonFormat(pattern = "HH:mm")
    @JsonDeserialize(using = SqlTimeDeserializer.class)
    private Time time;
    private String patient_name;

    public BookAppointment() {

    }

    public BigInteger getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(BigInteger doctor_id) {
        this.doctor_id = doctor_id;
    }

    public BigInteger getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(BigInteger patient_id) {
        this.patient_id = patient_id;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public BigInteger getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(BigInteger booking_id) {
        this.booking_id = booking_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }
}
