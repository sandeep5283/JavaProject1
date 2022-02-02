package com.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stubCon
		try {
			Connection con=
DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Simplilearn");
			System.out.println(con);
			
				Statement stmt=con.createStatement();
			int result=	stmt.executeUpdate("INSERT  INTO employee VALUES('SANDEEP','ELURU','SANDEEP@GMAIL.COM')");
			System.out.println(result+"rows inserted");
		
			}
			
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
