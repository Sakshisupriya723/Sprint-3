package com.example.spectaclesdatabase.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Spectacleproduct {

	@Id
	private String spectaclename;
	private String spectacledesc;
	private String spectaclelink;
	public String getSpectaclename() {
		return spectaclename;
	}
	public void setSpectaclename(String spectaclename) {
		this.spectaclename = spectaclename;
	}
	public String getSpectacledesc() {
		return spectacledesc;
	}
	public void setSpectacledesc(String spectacledesc) {
		this.spectacledesc = spectacledesc;
	}
	public String getSpectaclelink() {
		return spectaclelink;
	}
	public void setSpectaclelink(String spectaclelink) {
		this.spectaclelink = spectaclelink;
	}
	
	
}
