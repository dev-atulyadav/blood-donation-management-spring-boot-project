package com.test.blooddonationmanagement.dao.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.blooddonationmanagement.dao.DonorDao;
import com.test.blooddonationmanagement.dto.Donor;
import com.test.blooddonationmanagement.repository.DonorRepository;

/**
 * @author Atul
 */
@Repository
public class DonorDaoImpl implements DonorDao {

	@Autowired
	private DonorRepository repository;

	@Override
	public Donor saveDonorDao(Donor donor) {
		return repository.save(donor);
	}

	@Override
	public Donor getDonorByIdDao(int id) {
		try {

			return repository.findById(id).get();
		} catch (NoSuchElementException e) {
			return null;
		}
	}

	@Override
	public Donor getDonorByEmailDao(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public Donor deleteDonorByEmailDao(String email) {
		Donor donor = getDonorByEmailDao(email);
		if (donor != null) {
			repository.delete(donor);
			return null;
		}
		return donor;
	}

	@Override
	public Donor updateDonorByEmailDao(Donor donor) {
		Donor donor2 = getDonorByEmailDao(donor.getEmail());
		if (donor2 != null) {
			return repository.save(donor);
		}
		return donor2;
	}

	@Override
	public List<Donor> getAllDonorsDao() {
		return repository.findAll();
	}

}
