package com.example.spectaclesdatabase.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spectaclesdatabase.Entity.Spectacleproduct;
import com.example.spectaclesdatabase.Exception.ResourceNotFoundException;
import com.example.spectaclesdatabase.Repository.SpectacleproductRepo;
import com.example.spectaclesdatabase.Service.SpectacleproductService;

@Service
public class SpectacleproductServiceimpl implements SpectacleproductService {

	@Autowired
	SpectacleproductRepo spectacleproductrepo;

	@Override
	public Spectacleproduct addProduct(Spectacleproduct spectacleProduct) {
		// TODO Auto-generated method stub
		return spectacleproductrepo.save(spectacleProduct);
	}

	@Override
	public Spectacleproduct update(String spectaclename, Spectacleproduct spectacleProduct) {
		// TODO Auto-generated method stub
		Spectacleproduct s1 = spectacleproductrepo.findByName(spectaclename);

		if (s1 != null) {

			s1.setSpectacledesc(spectacleProduct.getSpectacledesc());
			;// old to new set
			s1.setSpectaclelink(spectacleProduct.getSpectaclelink());
			return spectacleproductrepo.save(s1);
		} else {
			throw new ResourceNotFoundException();
		}
	}

	@Override
	public void Delete(String spectaclename) {
		// TODO Auto-generated method stub

		Spectacleproduct s2 = spectacleproductrepo.findByName(spectaclename);

		if (s2 != null) {
			spectacleproductrepo.delete(s2);
		} else {
			throw new ResourceNotFoundException();
		}
	}
}
