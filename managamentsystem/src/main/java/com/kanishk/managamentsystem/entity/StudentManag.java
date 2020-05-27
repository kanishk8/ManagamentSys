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
