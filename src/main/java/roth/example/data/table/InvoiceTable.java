package roth.example.data.table;

import java.util.LinkedList;

import roth.example.data.Db;
import roth.example.data.model.Invoice;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class InvoiceTable extends MysqlDbTable<Invoice> {

	protected Db db;

	protected InvoiceTable(Db db) {
		super(Invoice.class);
		this.db = db;
	}

	public static InvoiceTable get(Db db) {
		return new InvoiceTable(db);
	}

	@Override
	public Jdbc getDb() {
		return db;
	}

	public Invoice findById(Integer id) {
		Select select = select();
		select.whereEquals("id", id);

		return findBy(select);
	}

	public Invoice findByInvoiceNumber(String invoiceNumber) {
		Select select = select();
		select.whereEquals("invoiceNumber", invoiceNumber);

		return findBy(select);
	}
	
	public LinkedList<Invoice> findAllByPersonId(String personId) {
		Select select = select();
		select.whereEquals("personId", personId);
		
		return findAllBy(select);
	}
	
	public LinkedList<Invoice> findAllByTotalAmountPaid(Double totalAmount) {
		Select select = select();
		select.whereGreaterThan("totalAmount", totalAmount).whereEquals("paid", 1);
		
		return findAllBy(select);
	}
}
