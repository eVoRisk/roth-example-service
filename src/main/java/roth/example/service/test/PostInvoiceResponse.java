package roth.example.service.test;

import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.service.HttpServiceRequest;

@Entity
@SuppressWarnings("serial")
public class PostInvoiceResponse extends HttpServiceRequest {

	@Property(name = "id")
	protected int id;

	@Property(name = "invoiceNumber")
	protected String invoiceNumber;

	@Property(name = "totalAmount")
	protected Double totalAmount;

	@Property(name = "paid")
	protected boolean paid;

	@Property(name = "personId")
	protected int personId;

	// Setters and getters
	public int getId() {
		return id;
	}

	public PostInvoiceResponse setId(int id) {
		this.id = id;
		return this;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public PostInvoiceResponse setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
		return this;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public PostInvoiceResponse setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
		return this;
	}

	public boolean isPaid() {
		return paid;
	}

	public PostInvoiceResponse setPaid(boolean paid) {
		this.paid = paid;
		return this;
	}

	public int getPersonId() {
		return personId;
	}

	public PostInvoiceResponse setPersonId(int personId) {
		this.personId = personId;
		return this;
	}
}
