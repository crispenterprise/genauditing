package com.crisp.audit.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.generic.audit.AuditObj;



public class JsonUtil {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String encode(Integer eventAuditId, boolean status){
		String jsonString = "";
		
		Map map = new HashMap();
		map.put("ID", eventAuditId);
		map.put("Status", status);
		
		
		JSONObject jsonObj = new JSONObject(map);
		jsonString = jsonObj.toString();
		
		return jsonString;
	}
	
	public AuditObj decode (String jsonStr) //kim
	{
		
		JSONObject audJasonOjb= new JSONObject(jsonStr);
		
		String dbHost = audJasonOjb.getString("dbHost");
		String dbName = audJasonOjb.getString("dbName");
		String dbUsername = audJasonOjb.getString("dbUsername");
		String dbPassword = audJasonOjb.getString("dbPasswordt");
		int dbPort = audJasonOjb.getInt("dbPort");
		String username = audJasonOjb.getString("username");
		int eventId  = audJasonOjb.getInt("eventId");
		
		AuditObj audObj = new AuditObj(dbHost,dbName,dbUsername,dbPassword,dbPort,username,eventId);
		return audObj;
	}

}
