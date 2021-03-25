package com.spring.restaurant.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AjaxWriteResult {
	int count;   
	String status;  
	String message;  
	
	LocalDateTime datetime = LocalDateTime.now(); 
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getdatetime() {
		if(this.datetime == null) return "";
		return this.datetime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	}
	




	
	
}
