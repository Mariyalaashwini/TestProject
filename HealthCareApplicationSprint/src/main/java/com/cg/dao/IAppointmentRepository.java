package com.cg.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entites.Appointment;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment,Integer> {
	
}