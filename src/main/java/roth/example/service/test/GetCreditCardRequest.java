package roth.example.service.test;

import java.sql.Date;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceRequest;

@Entity
@SuppressWarnings("serial")
public class GetCreditCardRequest extends HttpServiceRequest {

	@Property(name = "id")
	protected int id;

	@Property(name = "cardNumber")
	protected String cardNumber;

	@Property(name = "expirationDate")
	protected Date expirationDate;

	// Setters and getters
	public int getId() {
		return id;
	}

	public GetCreditCardRequest setId(int id) {
		this.id = id;
		return this;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public GetCreditCardRequest setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		return this;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public GetCreditCardRequest setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
		return this;
	}

}
