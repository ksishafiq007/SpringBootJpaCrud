package com.spring.dto;

import java.awt.image.BufferedImage;

import org.springframework.web.multipart.MultipartFile;

public class TeacherDTO {
	
	private Long teacherID;
	private String teacherName;
	private int teacherRoll;
	private String email;
	private String teacherPhotoName;
	private BufferedImage bufferedPhoto;
	private byte[] image;
	private MultipartFile photo;
	
	
	public TeacherDTO() {
		super();
	}

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

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}
	
	
	
}
