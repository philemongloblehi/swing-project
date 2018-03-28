package com.agreotech.daoImpl;

/**
 * 
 * @author PHILEMON GLOBLEHI
 * @since 23/03/2018
 * @version 1.1
 * 
 * Cette classe dénommée "Singleton" permettra
 * La connexion à la base de données
 * De garantir l'unicité de celle-ci dans notre programme
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	
	private static final String URL = "jdbc:mysql://localhost:3306/agreotechdb";
	private static final String LOGIN = "root";
	private static final String PASSWORD = "";
	
	private static Connection conn;
	
	private Singleton() {
		
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

}
