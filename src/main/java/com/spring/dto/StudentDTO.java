package com.spring.dto;

import java.awt.image.BufferedImage;
import java.io.File;
import org.springframework.web.multipart.MultipartFile;


public class StudentDTO {
	
	private Long studentID;
	private String studentName;
	private int studentRoll;
	private String email;
	private String photoName;
	private BufferedImage bufferedPhoto;
	
	private byte[] image;

	
	private MultipartFile photo;
	
	public StudentDTO() {
		super();
	}
			
	public Long getStudentID() {
		return studentID;
	}
	public void setStudentID(Long studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public BufferedImage getBufferedPhoto() {
		return bufferedPhoto;
	}

	public void setBufferedPhoto(BufferedImage bufferedPhoto) {
		this.bufferedPhoto = bufferedPhoto;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

}
