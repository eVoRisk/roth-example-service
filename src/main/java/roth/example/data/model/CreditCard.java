package roth.example.data.model;

import java.sql.Date;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.JdbcModel;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "credit_card")
@SuppressWarnings("serial")
public class CreditCard extends MysqlDbModel {

	protected transient Db db;

	@Property(name = "id", id = true, generated = true)
	protected int id;

	@Property(name = "cardNumber")
	protected String cardNumber;

	@Property(name = "securityCode")
	protected String securityCode;

	@Property(name = "expirationDate")
	protected Date expirationDate;

	@Property(name = "personId")
	protected int personId;

	// Default constructor
	public CreditCard() {

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

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = setDirty("cardNumber", this.cardNumber, cardNumber);
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = setDirty("securityCode", this.securityCode, securityCode);
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = setDirty("expirationDate", this.expirationDate, expirationDate);
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = setDirty("personId", this.personId, personId);
	}

}
