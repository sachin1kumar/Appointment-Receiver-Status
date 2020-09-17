package com.appointment.receiver.status.Appointment.Receiver.Status.repositories;

import com.appointment.receiver.status.Appointment.Receiver.Status.model.BookAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookAppointmentRepository extends JpaRepository<BookAppointment, BigInteger> {
}
