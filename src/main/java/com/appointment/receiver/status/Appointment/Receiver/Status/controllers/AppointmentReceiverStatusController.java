package com.appointment.receiver.status.Appointment.Receiver.Status.controllers;

import com.appointment.receiver.status.Appointment.Receiver.Status.model.*;
import com.appointment.receiver.status.Appointment.Receiver.Status.repositories.BookAppointmentRepository;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigInteger;
import java.util.Objects;

@RestController
@RequestMapping("/check-appointment-limit")
public class AppointmentReceiverStatusController {

    @Autowired
    private BookAppointmentRepository bookAppointmentRepository;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<ResponseFlag> checkAppointmentStatus(@RequestBody DoctorAppointments bookAppointment) {
        final HttpEntity<ObjectNode> requestEntity = new HttpEntity(bookAppointment);

        ResponseEntity<CustomResponse> customResponse = restTemplate.exchange("http://total-received-appointments-service/total-received-appointments/", HttpMethod.POST, requestEntity, CustomResponse.class);
        BigInteger totalReceivedAppointment = Objects.requireNonNull(customResponse.getBody()).getTotalRecResponse();

        ResponseEntity<ResponseLimit> doctorAppointments = restTemplate.exchange("http://doctor-appointments-limit-service/doctor-appointment-limit/", HttpMethod.POST, requestEntity, ResponseLimit.class);
        BigInteger appointmentLimit = Objects.requireNonNull(doctorAppointments.getBody()).getAppointment_limit();

        ResponseFlag responseFlag = new ResponseFlag();
        responseFlag.setSlotAvailable(totalReceivedAppointment.intValue() < appointmentLimit.intValue());
        return ResponseEntity.status(HttpStatus.CREATED).body(responseFlag);
    }
}
