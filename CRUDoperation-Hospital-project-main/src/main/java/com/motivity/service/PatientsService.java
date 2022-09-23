package com.motivity.service;

import java.util.List;

import com.motivity.model.Patients;

public interface PatientsService {
	
	public void addPatients(Patients patients);

	public List<Patients> getAllPatients();

	public void deletePatients(Integer patientsId);

	public Patients getPatients(int patientsid);

	public Patients updatePatients(Patients patients);


}
