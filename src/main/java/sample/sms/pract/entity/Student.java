package sample.sms.pract.entity;

import javax.persistence.*;

@Entity
@Table(name = "students" ) 
//if you don't add table it takes class name by default
public class Student {
	@Id// we need to add primary key to this table data so we use @ID annotation & primary generation status issue and check strategy
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//if you don't add column annotation it maps automatically column name as fields name done by jpa by default
	@Column(name = "firstName")
	private String firstName;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "email")
	private String email;
	
	public Student() {
	}
	
	
	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
