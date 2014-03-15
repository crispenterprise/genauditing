package com.generic.audit;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.json.JSONString;

import sun.net.www.http.HttpClient;

public class JavaTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			    
	    try{
	    	
	    	URL url = null;
	       
	    	url = new URL("http://localhost:8080/Auditing/Audit");
	
	    	HttpURLConnection urlConn = null;
				
			urlConn = (HttpURLConnection) url.openConnection();
			
			urlConn.setDoInput (true);
			
			urlConn.setDoOutput (true);
			
			urlConn.setRequestMethod("POST");
			
			urlConn.setRequestProperty("Content-Type", "application/json");
			
			urlConn.connect();
			
			DataOutputStream output = null;

			DataInputStream input = null;
			
			output = new DataOutputStream(urlConn.getOutputStream());
			
			  
			JSONObject obj=new JSONObject();
			obj.put("dbHost","localhost");
			obj.put("dbPort",new Integer(3306));
			obj.put("dbName","genaudit");
			obj.put("dbUsername","root");
			obj.put("dbPassword","");
			obj.put("eventId",new Integer(1));
			obj.put("userName","andpwil");
			obj.put("comment","User Crisp Technologies registered with username andpwil.");
    
  
			StringWriter out = new StringWriter();
			String jsonText = out.toString();
			System.out.print(jsonText);
			  
			 
			  
			 /* Send the request data.*/
			 output.writeBytes(jsonText);
			 output.flush();
			 output.close();
			
			 /* Get response data.*/
			String response = null;
			input = new DataInputStream (urlConn.getInputStream());
			while (null != ((response = input.readLine()))) {
			    System.out.println(response);
			    input.close ();
			}
		}catch(Exception e){
				    	  
		}		
	}
}