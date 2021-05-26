package com.example.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dao.IDiagnosticCenterRepository;
import com.cg.entites.Appointment;
import com.cg.entites.DiagnosticCenter;
import com.cg.service.IDiagnosticCenterService;

@SpringBootTest
public class DCentermoduleApplication {

	@Autowired
	IDiagnosticCenterService dcservice;
	@MockBean
	IDiagnosticCenterRepository idrepo;
	@Test
	void contextLoads() {
		
	}
	@Test
	public void getAllCenter() {
		List<DiagnosticCenter> dc =(List<DiagnosticCenter>)new DiagnosticCenter();
		dc=(List<DiagnosticCenter>) idrepo.findAll();
		verify(idrepo,times(1)).saveAll(dc);
	}

@Test
public void getDiagnosticCenteById(){
	idrepo.findById(1);
	verify(idrepo,times(1)).findById(1);
	
}

@Test
public void getDiagnosticCenter(){
	idrepo.findById(1);
	verify(idrepo,times(1)).findById(1);
	
}
@Test
public void removeDiagnosticCenter(){
	idrepo.deleteById(1);
	verify(idrepo, times(1)).findById(1);
	
}
/*public void getListOfAppointments() {
	List<Appointment> dc=(List<Appointment>) new Appointment();
	dc=idrepo.findAll();
	verify(idrepo,times(1)).save(dc);
}*/

}