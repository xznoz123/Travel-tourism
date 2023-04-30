package swing;

import java.sql.*;
import java.util.*;

public class connections {
	Connection c;
	Statement s;

	connections() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///travelvsm:3306", "root", "Ashishsahay");
			s = c.createStatement();
			System.out.println("inserting record");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
