package com.test.blooddonationmanagement.dto;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Atul
 */
@Entity
@Data
public class Donor {

	@Id
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false, unique = true)
	private long phone;
	@Column
	private String bloodGroup;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private LocalDate date;

}
