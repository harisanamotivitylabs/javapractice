package com.motivity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.motivity.model.Patients;

@Repository
public class PatientsDAOImpl implements PatientsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addPatients(Patients patients) {
		sessionFactory.getCurrentSession().saveOrUpdate(patients);

	}

	@SuppressWarnings("unchecked")
	public List<Patients> getAllPatients() {

		return sessionFactory.getCurrentSession().createQuery("from Patients")
				.list();
	}

	@Override
	public void deletePatients(Integer patientsId) {
		Patients patients = (Patients) sessionFactory.getCurrentSession().load(
				Patients.class, patientsId);
		if (null != patients) {
			this.sessionFactory.getCurrentSession().delete(patients);
		}

	}
	public Patients getPatients(int patid) {
		return (Patients) sessionFactory.getCurrentSession().get(
				Patients.class, patid);
	}

	@Override
	public Patients updatePatients(Patients patients) {
		sessionFactory.getCurrentSession().update(patients);
		return patients;
	}

}