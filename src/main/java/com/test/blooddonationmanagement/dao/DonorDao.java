package com.test.blooddonationmanagement.dao;

import java.util.List;

import com.test.blooddonationmanagement.dto.Donor;

/**
 * @author Atul
 */
public interface DonorDao {

	public Donor saveDonorDao(Donor donor);

	public Donor getDonorByIdDao(int id);

	public Donor getDonorByEmailDao(String email);

	public Donor deleteDonorByEmailDao(String email);

	public Donor updateDonorByEmailDao(Donor donor);

	public List<Donor> getAllDonorsDao();
}
