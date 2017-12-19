package roth.example.data.table;

import java.sql.Date;
import java.util.LinkedList;

import roth.example.data.Db;
import roth.example.data.model.CreditCard;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class CreditCardTable extends MysqlDbTable<CreditCard> {

	protected Db db;

	protected CreditCardTable(Db db) {
		super(CreditCard.class);
		this.db = db;
	}

	public static CreditCardTable get(Db db) {
		return new CreditCardTable(db);
	}

	@Override
	public Jdbc getDb() {
		return db;
	}
	
	public CreditCard findById(Integer id) {
		Select select = select();
		select.whereEquals("id", id);
		
		return findBy(select);
	}
	
	public CreditCard findByCardNumber(String cardNumber) {
		Select select = select();
		select.whereEquals("cardNumber", cardNumber);
		
		return findBy(select);
	}
	
	public LinkedList<CreditCard> findAllByExpirationDate(Date expirationDate) {
		Select select = select();
		select.whereGreaterThanOrEquals("expirationDate", expirationDate);
		
		return findAllBy(select);
	}

}
