package com.test.blooddonationmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.blooddonationmanagement.dto.Donor;

/**
 * @author Atul
 */
public interface DonorRepository extends JpaRepository<Donor, Integer> {

	public Donor findByEmail(String email);

}
