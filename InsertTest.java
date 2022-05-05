import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.sbi.ApplicantAlreadyExistException;

public class InsertTest {

	public static void main(String[] args) throws ApplicantAlreadyExistException {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			Scanner scan=new Scanner(System.in);
			int appId=scan.nextInt();
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO BANK_APPLICANT VALUES (?,?,?,?,?,?) ");
			
			pst.setInt(1, appId);
			pst.setString(2, "Pattinson");
			pst.setString(3, "robert@gmail.com");
			pst.setString(4, "6667778880");
			pst.setString(6, "Mumbai");
			
			Calendar cal = Calendar.getInstance();
			java.util.Date date = cal.getTime();
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			pst.setDate(5,sqlDate);
			System.out.println("prepared statement is created..."+pst);
			
			
			Statement st = conn.createStatement();
			System.out.println("statement is created..."+st);
			
			
			
			ResultSet rs = st.executeQuery("SELECT applicant_id FROM BANK_APPLICANT where APPLICANT_ID="+appId);
			
			if(rs.next()) {
				throw new ApplicantAlreadyExistException("applicant already exist with this ID");
				}
			
			else
			{
			 int row1 = pst.executeUpdate();
			System.out.println("row inserted..."+row1);
			}
			
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(SQLException e) {
			System.out.println("Some problem : "+e);
		}
	}
		
}

