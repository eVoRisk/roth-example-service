package roth.example.data;

import java.io.PrintWriter;

import roth.lib.java.jdbc.mysql.MysqlDb;

public class Db extends MysqlDb
{
	public static Db get()
	{
		return new Db();
	}
	
	protected Db()
	{
		//Put your Db parameters here if different
		super("com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1/rothexample", "root", "password");
		setLogWriter(new PrintWriter(System.out, true));
	}
}
