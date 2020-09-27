package com.sherpaacademy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sherpaacademy.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
