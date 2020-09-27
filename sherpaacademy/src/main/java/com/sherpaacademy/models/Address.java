package com.sherpaacademy.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private long zipCode;
	private String country;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="user_id", nullable = true)
	private User user;

	public Address(String street1, String street2, String city, String state, long zipCode, String country) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	
	

}
