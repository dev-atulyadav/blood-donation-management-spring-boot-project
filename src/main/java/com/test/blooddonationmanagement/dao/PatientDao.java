package com.test.blooddonationmanagement.dao;

import java.util.List;

import com.test.blooddonationmanagement.dto.Patient;

/**
 * @author Atul
 */
public interface PatientDao {

	public Patient savePatientDao(Patient patient);

	public Patient getPatientByIdDao(int id);

	public Patient getPatientByEmailDao(String email);

	public Patient deletePatientByEmailDao(String email);

	public Patient updatePatientByEmailDao(Patient patient);

	public List<Patient> getAllPatientsDao();
}
