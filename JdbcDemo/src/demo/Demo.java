package demo;
import java.sql.*;

public class Demo {
	public static void main(String[] args)throws Exception {

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","manager");
	Statement stmt=con.createStatement();
	stmt.executeUpdate("create table sample(id number,name varchar2(20),price number)");
	System.out.println("table created");
	  con.close();



	

}
}
