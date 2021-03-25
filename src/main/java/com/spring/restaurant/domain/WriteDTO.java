package com.spring.restaurant.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WriteDTO {
	private int uid; 
	private String name; 
	private int grade;
	private String addr;
//	@JsonProperty("regdate")
//	private LocalDateTime regDate; 


	public WriteDTO() {
		super();
	}



	public int getUid() {
		return uid;
	}



	public void setUid(int uid) {
		this.uid = uid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public String getAddr() {
		return addr;
	}



	public void setAddr(String addr) {
		this.addr = addr;
	}

//
//
//	public LocalDateTime getRegDate() {
//		return regDate;
//	}
//
//
//
//	public void setRegDate(LocalDateTime regDate) {
//		this.regDate = regDate;
//	}
//
//
//
//	//  regDate 를 String 으로 리턴하는 getter
//	public String getRegDateTime() {
//		if(this.regDate == null) return "";
//		return this.regDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
//	}
//	
//	@Override
//	public String toString() {
//		return String.format("WriteDTO] %d : %s : %d : %s : %s", 
//				uid, name, grade, addr, regDate);
//	}
	
	
} // end DTO












