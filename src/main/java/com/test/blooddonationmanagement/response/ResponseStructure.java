package com.test.blooddonationmanagement.response;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author Atul
 * @param <T>
 */
@Data
@Component
public class ResponseStructure<T> {

	private String msg;
	private T data;
	private int status;

}
