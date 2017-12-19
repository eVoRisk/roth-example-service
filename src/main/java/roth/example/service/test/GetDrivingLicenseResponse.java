package roth.example.service.test;

import java.sql.Date;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class GetDrivingLicenseResponse extends HttpServiceResponse {

	@Property(name = "id")
	protected int id;
	
	@Property(name="licenseNumber")
	protected String licenseNumber;
	
	@Property(name="issueDate")
	protected Date issueDate;
	
	@Property(name="personId")
	protected int personId;


	// Setters and getters
	public int getId() {
		return id;
	}

	public GetDrivingLicenseResponse setId(int id) {
		this.id = id;
		return this;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public GetDrivingLicenseResponse setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
		return this;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public GetDrivingLicenseResponse setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
		return this;
	}

	public int getPersonId() {
		return personId;
	}

	public GetDrivingLicenseResponse setPersonId(int personId) {
		this.personId = personId;
		return this;
	}
	
}
