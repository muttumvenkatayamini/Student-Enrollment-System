package sample.sms.pract.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import sample.sms.pract.entity.Student;
import sample.sms.pract.repository.StudentRepository;
import sample.sms.pract.service.StudentService;

@Service
public class StudentServiceimpl implements StudentService {

	
	private StudentRepository studentRepository;
	
	
	public StudentServiceimpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();// student repo actually have all crude operations and find all for list all students
	}


	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
		
		return studentRepository.findById(id).get();
	}


	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		
	}

}
