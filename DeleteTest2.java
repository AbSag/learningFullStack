import java.sql.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import com.sbi.ApplicantAlreadyExistException;
import com.sbi.ApplicantNotFoundException;
import com.sbi.ApplictionIdNotFoundException;

public class DeleteTest2 {

	public static void main(String[] args) throws ApplictionIdNotFoundException {
		try
		{
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded.../registered....");
		
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the db....");
			
			Statement st = conn.createStatement();
			System.out.println("statement is created..."+st);
			
			
			
			Scanner scan=new Scanner(System.in);
			int appId=scan.nextInt();
			
			
			ResultSet rs = st.executeQuery("SELECT * FROM BANK_APPLICANT WHERE APPLICANT_ID = "+appId);
			PreparedStatement pst = conn.prepareStatement("DELETE from BANK_APPLICANT WHERE APPLICANT_ID="+appId);
			
			
				if(rs.next()) {
					
					
					int row = pst.executeUpdate();
					System.out.println("row deleted ..."+row);
					
				}
			
				else {
				
					throw new ApplictionIdNotFoundException("The applicant with this id is not found : "+appId);
				
				}
				
			pst.close();
			conn.close();
			System.out.println("DisConnected from the db....");
			
		}
		catch(ApplictionIdNotFoundException e) {
			System.out.println("Record not Exits: "+e);
		}
		catch(SQLException e) {
			System.out.println("Some problem : "+e);
		}
			
			
	}
}

