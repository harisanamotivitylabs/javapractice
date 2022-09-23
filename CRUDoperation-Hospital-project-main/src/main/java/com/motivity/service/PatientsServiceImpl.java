package com.motivity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.motivity.dao.PatientsDAO;
import com.motivity.model.Patients;

@Service
@Transactional
public class PatientsServiceImpl implements PatientsService {

	@Autowired
	private PatientsDAO patientsDAO;

	@Override
	@Transactional
	public void addPatients(Patients patients) {
		patientsDAO.addPatients(patients);
	}
	@Override
	@Transactional
	public List<Patients> getAllPatients() {
		return patientsDAO.getAllPatients();
	}

	@Override
	@Transactional
	public void deletePatients(Integer patientsId) {
		patientsDAO.deletePatients(patientsId);
	}

	public Patients getPatients(int patid) {
		return patientsDAO.getPatients(patid);
	}

	public Patients updatePatients(Patients patients) {

		return patientsDAO.updatePatients(patients);
	}

	public void setPatientsDAO(PatientsDAO patientsDAO) {
		this.patientsDAO = patientsDAO;
	}

}
