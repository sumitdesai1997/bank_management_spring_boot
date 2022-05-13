package com.bankmanagement.exception;

import java.util.Date;

public class ExceptionResponse {

	private Date datetime;
	private String message;
	private String description;
	
	public ExceptionResponse(Date datetime, String message, String description) {
		super();
		this.datetime = datetime;
		this.message = message;
		this.description = description;
	}
	
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [datetime=" + datetime + ", message=" + message + ", description=" + description
				+ "]";
	}
	
}
