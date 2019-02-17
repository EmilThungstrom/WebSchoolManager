package com.lexicon.emil.WebSchoolManager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="idStudent")
	private int idStudent;
	
	@Column(name="firstName")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String firstName;
	
	@Column(name="lastName")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@Column(name="email")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String email;
	
	@Column(name="address")
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String address;

	public Student() { }
	
	public Student(String firstName, String lastName, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + "]";
	}
}
