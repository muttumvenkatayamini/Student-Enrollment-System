package sample.sms.pract.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sample.sms.pract.entity.Student;
//type of Jpa entity means cls name in entity package and long id type of the primary key in student class

// have default implementation class simple jpa repository in jparepository so no need to add repository annotation
public interface StudentRepository extends JpaRepository<Student, Long> { 
	
	

}
