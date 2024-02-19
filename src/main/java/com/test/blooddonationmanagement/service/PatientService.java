package com.test.blooddonationmanagement.service;

import java.util.List;

import com.test.blooddonationmanagement.dto.Patient;
import com.test.blooddonationmanagement.response.ResponseStructure;

/**
 * @author Atul
 */
public interface PatientService {

	public ResponseStructure<Patient> savePatientService(Patient patient);

	public ResponseStructure<Patient> getPatientByIdService(int id);

	public ResponseStructure<Patient> getPatientByEmailService(String email);

	public ResponseStructure<Patient> deletePatientByEmailService(String email);

	public ResponseStructure<Patient> updatePatientByEmailService(Patient patient);

	public ResponseStructure<List<Patient>> getAllPatientsService();
}
