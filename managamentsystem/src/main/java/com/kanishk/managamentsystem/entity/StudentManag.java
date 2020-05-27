package com.kanishk.managamentsystem.entity;

import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_details")
@Setter
@Getter
@ToString
public class StudentManag {
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getSkill_set() {
		return skill_set;
	}
	public void setSkill_set(String skill_set) {
		this.skill_set = skill_set;
	}
	public String getContact_details() {
		return contact_details;
	}
	public void setContact_details(String contact_details) {
		this.contact_details = contact_details;
	}
	public Date getTentative_joining_date() {
		return tentative_joining_date;
	}
	public void setTentative_joining_date(Date tentative_joining_date) {
		this.tentative_joining_date = tentative_joining_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String institute;
	private String skill_set;
	private String contact_details;
	private Date tentative_joining_date;
	private String location;
	private String description;
	private String  feedback;
	
	
	
	

}
