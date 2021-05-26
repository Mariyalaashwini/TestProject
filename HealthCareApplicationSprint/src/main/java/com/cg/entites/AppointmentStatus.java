package com.cg.entites;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="a_status")
public enum AppointmentStatus implements Serializable{
	approved("approved"),cancelled("cancelled");
	@Id
	@Column(name="status")
	private String status;
	@OneToOne(mappedBy="status",cascade=CascadeType.ALL)
	private Appointment appointments;
	AppointmentStatus(String status ) {
		this.setStatus(status);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}