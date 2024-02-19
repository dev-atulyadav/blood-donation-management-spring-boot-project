package com.test.blooddonationmanagement.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.blooddonationmanagement.dao.DonorDao;
import com.test.blooddonationmanagement.dto.Donor;
import com.test.blooddonationmanagement.response.ResponseStructure;
import com.test.blooddonationmanagement.service.DonorService;

/**
 * @author Atul
 */
public class DonorServiceImpl implements DonorService {

	@Autowired
	private DonorDao dao;
	@Autowired
	private ResponseStructure<Donor> structure;
	@Autowired
	private ResponseStructure<List<Donor>> structure2;

	@Override
	public ResponseStructure<Donor> saveDonorService(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<Donor> getDonorByIdService(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<Donor> getDonorByEmailService(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<Donor> deleteDonorByEmailService(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<Donor> updateDonorByEmailService(Donor donor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseStructure<List<Donor>> getAllDonorsService() {
		// TODO Auto-generated method stub
		return null;
	}

}
