package it.objectmethod.RestTutorial.model;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;

@Data

@Getter
@Entity
@Table(name="employee")
public class Employee {

	@Id 
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private  Long id;
	private String name;
	private String role;

	public Employee(String name, String role) {
		this.name = name;
		this.role = role;
	}
	public Employee () {
		
	}

	public Optional<Employee> map(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	

}
