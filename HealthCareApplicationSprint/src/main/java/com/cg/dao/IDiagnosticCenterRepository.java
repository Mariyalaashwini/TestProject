package com.cg.dao;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entites.DiagnosticCenter;

//import com.cg.entites.Appointment;

import com.cg.exceptions.DiagnosticCenterNotFoundException;


@Repository
public interface IDiagnosticCenterRepository extends JpaRepository<DiagnosticCenter,Integer> {

	DiagnosticCenter findByDcenterid(int dcenterid);
	

}



