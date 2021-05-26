package com.cg.entites;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="d_test")
public class DiagnosticTest implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="dtest_Id")
	private int dtest_Id;
	@Column(name="testName")
	private String testname;
	@Column(name="testPrice")
	private double testPrice;
	@Column(name="normalValue")
	private String normalValue;
	@Column(name="units")
	private String units;	
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="tests")
	private Set<DiagnosticCenter> diagnosticCenters = new HashSet<>();
	@ManyToOne
	@JoinColumn(name="app_id")
	private Appointment appointments;
	public int getDtest_Id() {
		return dtest_Id;
	}
	public void setDtest_Id(int dtest_Id) {
		this.dtest_Id = dtest_Id;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}
	public double getTestPrice() {
		return testPrice;
	}
	public void setTestPrice(double testPrice) {
		this.testPrice = testPrice;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Set<DiagnosticCenter> getDiagnosticCenters() {
		return diagnosticCenters;
	}
	public void setDiagnosticCenters(Set<DiagnosticCenter> diagnosticCenters) {
		this.diagnosticCenters = diagnosticCenters;
	}
	public Appointment getAppointments() {
		return appointments;
	}
	public void setAppointments(Appointment appointments) {
		this.appointments = appointments;
	}
	@Override
	public String toString() {
		return "DiagnosticTest [dtest_Id=" + dtest_Id + ", testname=" + testname + ", testPrice=" + testPrice
				+ ", normalValue=" + normalValue + ", units=" + units + ", diagnosticCenters=" + diagnosticCenters
				+ ", appointments=" + appointments + "]";
	}
	
}