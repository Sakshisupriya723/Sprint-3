package com.example.spectaclesdatabase.Service;

import com.example.spectaclesdatabase.Entity.Spectacleproduct;

public interface SpectacleproductService {

	Spectacleproduct addProduct(Spectacleproduct spectacleProduct);
	
	Spectacleproduct update(String spectaclename,Spectacleproduct spectacleProduct);
	
	void Delete(String spectaclename);
}
