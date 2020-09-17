package com.total.received.appointments.GetTotalReceivedAppointments.repositories;

import com.total.received.appointments.GetTotalReceivedAppointments.model.BookAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookAppointmentRepository extends JpaRepository<BookAppointment, BigInteger> {
}
