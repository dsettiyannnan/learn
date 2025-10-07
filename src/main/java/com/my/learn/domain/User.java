package com.my.learn.domain;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.Resource;
import org.springframework.web.servlet.resource.ResourceTransformerChain;
import org.springframework.web.servlet.resource.ResourceTransformerSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.servlet.http.HttpServletRequest;

@Entity
@Table(name="USR")
@JsonIgnoreProperties({"firtName","lastName"})
public class User  {
	
	@jakarta.persistence.Id
	private Long id;
	
	
	@Column(name="FIRST_NAME", nullable = false, length = 32)
	private String firstName;
	
	@Column(name="LAST_NAME", nullable = false, length = 32)
	private String lastName;
	
	@Column(name="CITY", nullable = true, length = 32)
	private String city;
	
	@Column(name="ROLE", nullable = true, length = 32)
	private String role;
	
	@Column(name="SSN", nullable = true, length = 15, unique = true)
	@JsonIgnore
	private String ssn;
	
	@Column(name="USER_NAME", nullable = false, length = 32, unique = true)
	private String username;
	
	@OneToMany(mappedBy="user")
	private List<Order> orders;
	
	
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public User() {
		super();
	}
	
	
	public User(String firstName, String lastName, String city, String role, String ssn, String username, Long id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.role = role;
		this.ssn = ssn;
		this.username = username;
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", role=" + role
				+ ", ssn=" + ssn + ", username=" + username + ", Id=" + id + "]";
	}
	
	
		

}
