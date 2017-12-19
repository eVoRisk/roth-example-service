package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceRequest;

@Entity
@SuppressWarnings("serial")
public class GetDrivingLicenseRequest extends HttpServiceRequest{

	@Property(name = "id")
	protected int id;
	
	@Property(name="licenseNumber")
	protected String licenseNumber;

	// Setters and getters
	public int getId() {
		return id;
	}

	public GetDrivingLicenseRequest setId(int id) {
		this.id = id;
		return this;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public GetDrivingLicenseRequest setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		return this;
	}
	
}
