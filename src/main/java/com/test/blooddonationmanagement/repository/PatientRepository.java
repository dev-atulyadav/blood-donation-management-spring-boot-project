package com.test.blooddonationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.blooddonationmanagement.dto.Patient;

/**
 * @author Atul
 */
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	public Patient findByEmail(String email);

}
