package roth.example.data.model;

import java.sql.Date;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.JdbcModel;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "driving_license")
@SuppressWarnings("serial")
public class DrivingLicense extends MysqlDbModel {

	protected transient Db db;

	@Property(name = "id", id = true, generated = true)
	protected int id;
	
	@Property(name="licenseNumber")
	protected String licenseNumber;
	
	@Property(name="issueDate")
	protected Date issueDate;
	
	@Property(name="personId")
	protected int personId;
	
	// Default constructor
	public DrivingLicense() {

	}

	// Overridden methods
	@Override
	public Jdbc getDb() {
		return db;
	}

	@Override
	public JdbcModel setDb(Jdbc db) {
		if (db instanceof Db) {
			this.db = (Db) db;
		}
		return this;
	}

	// Setters and getters
	public int getId() {
		return id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = setDirty("licenseNumber", this.licenseNumber, licenseNumber);
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = setDirty("issueDate", this.issueDate, issueDate);
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = setDirty("personId", this.personId, personId);
	}
	
}
