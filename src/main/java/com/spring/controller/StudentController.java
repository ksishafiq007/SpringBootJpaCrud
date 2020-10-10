
package com.spring.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.dto.StudentDTO;
import com.spring.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@Autowired
	ServletContext servletContext;
	
	public final String UPLOAD_DIRECTORY="D:/images";
	
	public boolean deletionStatus= false;
	
	
	@RequestMapping(path="/saveStudent", method=RequestMethod.POST)
	public String saveStudent(StudentDTO studentDTO) {
		
		String photoName=studentDTO.getPhoto().getOriginalFilename();
		
	    Path path = Paths.get(UPLOAD_DIRECTORY + File.separator + photoName );
		
		try {
			Files.write(path,  studentDTO.getPhoto().getBytes());
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		studentDTO.setPhotoName(photoName);		
		
		studentService.saveOrUpdateStudent(studentDTO);		
		return "redirect:/";
	}
	
	
	
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String test(Model model) {
		model.addAttribute("studentDTO", new StudentDTO());
	return "home";	
	}
	
	
	@RequestMapping(path="/allStudents", method=RequestMethod.GET)
	public String saveStudent(Model model) {
		try {
			
		model.addAttribute("students",studentService.findAllStudents());
		//model.addAttribute("error", "Test Error");
		if(deletionStatus) {
			model.addAttribute("messsage","Deletion Successful.");			
		}
		deletionStatus=false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "studentList";
	}
	
	
	
	@RequestMapping(path="/student/edit/{studentID}", method=RequestMethod.GET)
	public String editStudent(Model model, @PathVariable(value="studentID") Long studentID) {
		try {			
		model.addAttribute("studentDTO",studentService.findByStudentID(studentID));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "home";
	}

	
	@RequestMapping(path="/student/delete/{studentID}", method=RequestMethod.GET)
	public String deleteStudent(Model model, @PathVariable(value="studentID") Long studentID) {
		try {	
			StudentDTO dto=new StudentDTO();
			dto.setStudentID(studentID);		
			studentService.deleteStudent(dto);
			deletionStatus= true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "redirect:/allStudents";
	}
	
	
}
