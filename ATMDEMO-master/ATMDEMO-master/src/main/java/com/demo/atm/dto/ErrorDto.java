package com.demo.atm.dto;

import io.swagger.annotations.ApiModel;

@ApiModel(description = "This is the Dto which can be used at the Exception handling machanism")
public class ErrorDto {

	private int statusCode;
	private String type;
	private String descrpiption;

	public void setStatusCode(int value) {
		this.statusCode = value;
	}

	public void setType(String type) {
		this.type = type;

	}

	public void setDescription(String description) {
		this.descrpiption = description;

	}

	public int getStatusCode() {
		return statusCode;
	}

	public String getType() {
		return type;
	}

	public String getDescrpiption() {
		return descrpiption;
	}

}
