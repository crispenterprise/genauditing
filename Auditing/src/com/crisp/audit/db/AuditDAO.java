package com.crisp.audit.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AuditDAO extends BaseDAO {

	
	public void insertAudit(){
		
		
			try {
				
				PreparedStatement stmt = null;
			
				
				String query = "insert into auditing (username, event, comment) VALUES (?, ?, ?)";
			
				stmt = dbConnection.prepareStatement(query);
			
					stmt.setString(1, "jerry");
					stmt.setString(2, "make payment");
					stmt.setString(3, "ok");
					
					 int count = stmt.executeUpdate();
				     System.out.println(count + "row(s) affected");
					
				     stmt.close();
				
						        
	            
	            
				
			} catch (SQLException e) {
				
				System.out.println("SQLException: " + e.getMessage());
	            System.out.println("SQLState:     " + e.getSQLState());
	            System.out.println("VendorError:  " + e.getErrorCode());
	
	            
			}
	}
	
	
	public void getAudits(){
		

		try {
			
			Statement stmt = dbConnection.createStatement();
						
			ResultSet RS = stmt.executeQuery("SELECT audit_id, username, event, comment from auditing");
			
            while (RS.next()) {
            	
            	 
            	System.out.println("audit_id : "+RS.getString(1));
            	System.out.println("username : "+RS.getString(2));
            	System.out.println("event : "+RS.getString(3));
            	System.out.println("comment : "+RS.getString(4));
            	
            	
            	                
            }
            
            RS.close();
            stmt.close();
            
			
		} catch (SQLException e) {
			
			System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState:     " + e.getSQLState());
            System.out.println("VendorError:  " + e.getErrorCode());

            
		}
		
		
		
	}//getSourceCoordinates

	
}
