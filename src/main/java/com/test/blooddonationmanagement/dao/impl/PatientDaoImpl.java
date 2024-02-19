package com.test.blooddonationmanagement.dao.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.blooddonationmanagement.dao.PatientDao;
import com.test.blooddonationmanagement.dto.Patient;
import com.test.blooddonationmanagement.repository.PatientRepository;

/**
 * @author Atul
 */
@Repository
public class PatientDaoImpl implements PatientDao {

	@Autowired
	private PatientRepository repository;

	@Override
	public Patient savePatientDao(Patient patient) {
		return repository.save(patient);
	}

	@Override
	public Patient getPatientByIdDao(int id) {
		try {

			return repository.findById(id).get();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Patient getPatientByEmailDao(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public Patient deletePatientByEmailDao(String email) {
		Patient patient = getPatientByEmailDao(email);
		if (patient != null) {
			repository.delete(patient);
			return null;
		}
		return patient;
	}

	@Override
	public Patient updatePatientByEmailDao(Patient patient) {
		Patient patient2 = getPatientByEmailDao(patient.getEmail());
		if (patient2 != null) {
			return repository.save(patient);
		}
		return patient2;
	}

	@Override
	public List<Patient> getAllPatientsDao() {
		return repository.findAll();
	}

}
