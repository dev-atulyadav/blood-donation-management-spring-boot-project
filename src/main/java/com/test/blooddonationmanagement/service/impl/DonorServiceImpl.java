package com.test.blooddonationmanagement.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.test.blooddonationmanagement.dao.DonorDao;
import com.test.blooddonationmanagement.dto.Donor;
import com.test.blooddonationmanagement.response.ResponseStructure;
import com.test.blooddonationmanagement.service.DonorService;

import jakarta.servlet.http.HttpSession;

/**
 * @author Atul
 */
@Service
public class DonorServiceImpl implements DonorService {

	@Autowired
	private HttpSession session;
	@Autowired
	private DonorDao dao;
	@Autowired
	private ResponseStructure<Donor> structure;
	@Autowired
	private ResponseStructure<List<Donor>> structure2;

	@Override
	public ResponseStructure<Donor> saveDonorService(Donor donor) {
		Donor donor2 = dao.getDonorByEmailDao(donor.getEmail());
		if (donor2 == null) {
			session.setAttribute("donorEmail", donor.getEmail());
			structure.setMsg("Data Inserted!!!");
			structure.setStatus(HttpStatus.CREATED.value());
			donor.setPassword("******");
			structure.setData(donor);
		} else {
			structure.setMsg("User already exists!!");
			structure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
			structure.setData(null);
		}
		return null;
	}

	@Override
	public ResponseStructure<Donor> getDonorByIdService(int id) {
		Donor donor = dao.getDonorByIdDao(id);
		if (donor != null) {
			donor.setPassword("******");
			structure.setData(donor);
			structure.setMsg("Data found!!!");
			structure.setStatus(HttpStatus.FOUND.value());
		} else {
			structure.setData(null);
			structure.setMsg("Data not found!!!");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		return structure;
	}

	@Override
	public ResponseStructure<Donor> getDonorByEmailService(String email) {
		Donor donor = dao.getDonorByEmailDao(email);
		if (donor != null) {
			donor.setPassword("******");
			structure.setData(donor);
			structure.setMsg("Data found!!!");
			structure.setStatus(HttpStatus.FOUND.value());
		} else {
			structure.setData(null);
			structure.setMsg("Data not found!!!");
			structure.setStatus(HttpStatus.NOT_FOUND.value());
		}
		return structure;
	}

	@Override
	public ResponseStructure<Donor> deleteDonorByEmailService(String email) {
		Donor donor = dao.deleteDonorByEmailDao(email);
		if (donor == null) {
			structure.setData(null);
			structure.setMsg("Data deleted!!!");
			structure.setStatus(HttpStatus.OK.value());
		} else {
			structure.setData(null);
			structure.setMsg("No record Found");
			structure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		}
		return structure;
	}

	@Override
	public ResponseStructure<Donor> updateDonorByEmailService(Donor donor) {
		Donor donor2 = dao.updateDonorByEmailDao(donor);
		if (donor2 != null) {
			donor.setPassword("******");
			structure.setData(donor);
			structure.setMsg("Data Updated!!!");
			structure.setStatus(HttpStatus.OK.value());
		} else {
			structure.setData(null);
			structure.setMsg("No record found!!!");
			structure.setStatus(HttpStatus.NOT_ACCEPTABLE.value());
		}
		return structure;
	}

	@Override
	public ResponseStructure<List<Donor>> getAllDonorsService() {
		List<Donor> donors = dao.getAllDonorsDao();
		List<Donor> list = new ArrayList<Donor>();
		if (!donors.isEmpty()) {
			for (Donor donor : donors) {
				donor.setPassword("*****");
				list.add(donor);
			}
			structure2.setData(list);
			structure2.setMsg("Data Found!!!");
			structure2.setStatus(HttpStatus.FOUND.value());
		} else {
			structure2.setData(null);
			structure2.setMsg("No data is present in DB!!!");
			structure2.setStatus(HttpStatus.OK.value());
		}
		return structure2;
	}

}
