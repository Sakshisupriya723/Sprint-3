package com.example.spectaclesdatabase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.spectaclesdatabase.Entity.Spectacleproduct;

@Repository
public interface SpectacleproductRepo extends JpaRepository<Spectacleproduct, Integer>  {


	@Query(value =  "select * from Spectacleproduct where spectaclename =?" , nativeQuery = true)
	Spectacleproduct findByName(String spectaclename);

}
