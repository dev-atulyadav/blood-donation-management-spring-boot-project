package com.test.blooddonationmanagement.service;

import java.util.List;

import com.test.blooddonationmanagement.dto.Donor;
import com.test.blooddonationmanagement.response.ResponseStructure;

/**
 * @author Atul
 */
public interface DonorService {

	public ResponseStructure<Donor> saveDonorService(Donor donor);

	public ResponseStructure<Donor> getDonorByIdService(int id);

	public ResponseStructure<Donor> getDonorByEmailService(String email);

	public ResponseStructure<Donor> deleteDonorByEmailService(String email);

	public ResponseStructure<Donor> updateDonorByEmailService(Donor donor);

	public ResponseStructure<List<Donor>> getAllDonorsService();
}
