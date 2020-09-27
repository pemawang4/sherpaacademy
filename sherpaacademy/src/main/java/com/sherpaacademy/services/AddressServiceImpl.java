package com.sherpaacademy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sherpaacademy.models.Address;
import com.sherpaacademy.repositories.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	public Address saveUserAddress(Address address) {
		addressRepository.save(address);
		return address;
	}

}
