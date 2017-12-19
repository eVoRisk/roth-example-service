package roth.example.service.test;

import java.sql.Date;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceResponse;

@Entity
@SuppressWarnings("serial")
public class GetCreditCardResponse extends HttpServiceResponse {

	@Property(name = "id")
	protected int id;

	@Property(name = "cardNumber")
	protected String cardNumber;

	@Property(name = "securityCode")
	protected String securityCode;

	@Property(name = "expirationDate")
	protected Date expirationDate;

	@Property(name = "personId")
	protected int personId;

	// Setters and getters
	public int getId() {
		return id;
	}

	public GetCreditCardResponse setId(int id) {
		this.id = id;
		return this;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public GetCreditCardResponse setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public GetCreditCardResponse setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
		return this;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public GetCreditCardResponse setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

	public int getPersonId() {
		return personId;
	}

	public GetCreditCardResponse setPersonId(int personId) {
		this.personId = personId;
		return this;
	}

}
