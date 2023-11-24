package sample.sms.pract.service;

import java.util.List;

import sample.sms.pract.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	

	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	void deleteStudentById(Long id);

	



}
