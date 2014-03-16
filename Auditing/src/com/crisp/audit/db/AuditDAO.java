package com.crisp.audit.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.generic.audit.AuditObj;


public class AuditDAO extends BaseDAO {

	
	public AuditDAO(AuditObj audit) {
		super(audit);
		// TODO Auto-generated constructor stub
	}


	public boolean insertAudit(AuditObj audit){
		
		boolean success = true;
			try {
				
				PreparedStatement stmt = null;
			
				
				String query = "insert into auditing (username, event, comment) VALUES (?, ?, ?)";
			
				stmt = dbConnection.prepareStatement(query);
			
					stmt.setString(1, audit.getUsername());
					stmt.setString(2, audit.getEvent());
					stmt.setString(3, audit.getComments());
					
					 int count = stmt.executeUpdate();
				     System.out.println(count + "row(s) affected");
					
				     stmt.close();
				
						        
	            
	            
				
			} catch (SQLException e) {
				
				System.out.println("SQLException: " + e.getMessage());
	            System.out.println("SQLState:     " + e.getSQLState());
	            System.out.println("VendorError:  " + e.getErrorCode());
	
	            success = false;
			}
			
			return success;
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
