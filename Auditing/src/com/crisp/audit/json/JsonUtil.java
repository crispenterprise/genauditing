package com.crisp.audit.json;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;



public class JsonUtil {
	
	public String encode(Integer eventAuditId, boolean status){
		String jsonString = "";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("ID", eventAuditId+"");
		map.put("Status", status+"");
		
		
		JSONObject jsonObj = new JSONObject(map);
		jsonString = jsonObj.toString();
		
		return jsonString;
	}

}
