package com.generic.audit;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;


/**
 * Servlet implementation class Audit
 */
@WebServlet("/Audit")
public class Audit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Audit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set response content type
	      response.setContentType("text/html");

	    //http://json-lib.sourceforge.net/
	      
	      JSONObject obj=new JSONObject();
	      obj.put("name","foo");
	      obj.put("num",new Integer(100));
	      obj.put("balance",new Double(1000.21));
	      obj.put("is_vip",new Boolean(true));
	     // obj.put("nickname",null);
	      StringWriter out = new StringWriter();
	      //obj.write(arg0)
	      String jsonText = out.toString();
	      System.out.print(jsonText);
	      
	      
	      
	      
	      // Actual logic goes here.
	      PrintWriter outHtml = response.getWriter();
	      
	      /*
	      Map obj=new LinkedHashMap();
	      obj.put("name","foo");
	      obj.put("num",new Integer(100));
	      obj.put("balance",new Double(1000.21));
	      obj.put("is_vip",new Boolean(true));
	      obj.put("nickname",null);
	      String jsonText = JSONValue.toJSONString(obj);
	      System.out.print(jsonText);
	      */
	      
	      
	      outHtml.println("<h1>" + "Hello World: " +jsonText+ "</h1>");
	      
	      
	      
	      
		
	}

}
