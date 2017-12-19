package roth.example.data.model;

import roth.example.data.Db;
import roth.lib.java.annotation.Entity;
import roth.lib.java.annotation.Property;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.JdbcModel;
import roth.lib.java.jdbc.mysql.MysqlDbModel;

@Entity(name = "invoice")
@SuppressWarnings("serial")
public class Invoice extends MysqlDbModel {

	protected transient Db db;

	@Property(name = "id", id = true, generated = true)
	protected Integer id;

	@Property(name = "invoiceNumber")
	protected String invoiceNumber;

	@Property(name = "totalAmount")
	protected Double totalAmount;

	@Property(name = "paid")
	protected boolean paid;

	@Property(name = "personId")
	protected Integer personId;

	// Default constructor
	public Invoice() {
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
	public Integer getId() {
		return id;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = setDirty("invoiceNumber", this.invoiceNumber, invoiceNumber);
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = setDirty("totalAmount", this.totalAmount, totalAmount);
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = setDirty("paid", this.paid, paid);
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = setDirty("personId", this.personId, personId);
	}

}
