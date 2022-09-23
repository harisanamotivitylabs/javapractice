package com.motivity.dao;

import java.util.List;
import com.motivity.model.Patients;

public interface PatientsDAO {

	public void addPatients(Patients patients);

	public List<Patients> getAllPatients();

	public void deletePatients(Integer patientsId);

	public Patients updatePatients(Patients patients);

	public Patients getPatients(int patientsid);
}
