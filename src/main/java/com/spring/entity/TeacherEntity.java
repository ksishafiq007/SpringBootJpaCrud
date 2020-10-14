package com.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name="teacher")
public class TeacherEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name = "teacherID")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long teacherID;
	
	@Column(name = "teacher_name")
	private String teacherName;
	
	@Column(name = "teacher_roll")
	private int teacherRoll;
	
	@Column(name = "email")
	private String email;
	
	
	@Column(name="teacher_photo_name")
	private String teacherPhotoName;

	public Long getTeacherID() {
		return teacherID;
	}

	public void setTeacherID(Long teacherID) {
		this.teacherID = teacherID;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public int getTeacherRoll() {
		return teacherRoll;
	}

	public void setTeacherRoll(int teacherRoll) {
		this.teacherRoll = teacherRoll;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeacherPhotoName() {
		return teacherPhotoName;
	}

	public void setTeacherPhotoName(String teacherPhotoName) {
		this.teacherPhotoName = teacherPhotoName;
	}
	

}
