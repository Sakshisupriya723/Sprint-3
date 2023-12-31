package com.example.spectaclesdatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spectaclesdatabase.Entity.Login;

@Repository
public interface LoginRepo  extends JpaRepository<Login, Integer>{

	@Query(value =  "select * from Login where email =?" , nativeQuery = true)
	Login findByEmail(String email);

}
