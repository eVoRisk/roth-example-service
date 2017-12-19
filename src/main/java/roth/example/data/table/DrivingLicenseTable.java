package roth.example.data.table;

import java.sql.Date;
import java.util.LinkedList;

import roth.example.data.Db;
import roth.example.data.model.DrivingLicense;
import roth.lib.java.jdbc.Jdbc;
import roth.lib.java.jdbc.mysql.MysqlDbTable;
import roth.lib.java.jdbc.sql.Select;

public class DrivingLicenseTable extends MysqlDbTable<DrivingLicense> {

	protected Db db;

	protected DrivingLicenseTable(Db db) {
		super(DrivingLicense.class);
		this.db = db;
	}

	public static DrivingLicenseTable get(Db db) {
		return new DrivingLicenseTable(db);
	}

	@Override
	public Jdbc getDb() {
		return db;
	}

	public DrivingLicense findById(Integer id) {
		Select select = select();
		select.whereEquals("id", id);

		return findBy(select);
	}

	public DrivingLicense findByLicenseNumber(String licenseNumber) {
		Select select = select();
		select.whereEquals("licenseNumber", licenseNumber);

		return findBy(select);
	}

}
