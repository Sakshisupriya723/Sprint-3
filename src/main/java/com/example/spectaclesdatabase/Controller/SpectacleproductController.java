package com.example.spectaclesdatabase.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.spectaclesdatabase.Entity.Spectacleproduct;
import com.example.spectaclesdatabase.Service.SpectacleproductService;

@RestController
public class SpectacleproductController {

	@Autowired
	SpectacleproductService spectacleproductservice;
	
	
	
	@PostMapping("/post")
	public Spectacleproduct addProduct(@RequestBody Spectacleproduct spectacleproduct) {
		
		return spectacleproductservice.addProduct(spectacleproduct);
	}
	
	@PutMapping("/update")
	public Spectacleproduct updateproduct(@RequestHeader String spectaclename, @RequestBody Spectacleproduct spectacleproduct) {

		return spectacleproductservice.update(spectaclename, spectacleproduct);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestHeader String spectaclename) {
		spectacleproductservice.Delete(spectaclename);
		return "data deleted";
	}
	
}
