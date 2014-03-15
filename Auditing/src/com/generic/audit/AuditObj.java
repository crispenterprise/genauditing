package com.generic.audit;

public class AuditObj {
	private String dbHost;
	private String dbName;
	private String dbUsername;
	private String dbPassword;
	private int dbPort;
	private String username;
	private int eventId;
	
	public AuditObj()
	{
		
	}
	
	public AuditObj(String host,String dbName,String dUsername,String password,int port, String username, int eventId)
	{
		this.dbHost = host;
		this.dbName = dbName;
		this.dbUsername = dUsername;
		this.dbPassword = host;
		this.dbPort = port;
		this.username = username;
		this.eventId = eventId;
	}
 
 
}
