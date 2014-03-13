package com.crisp.audit.db;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AuditDAO auditDAO = new AuditDAO();
		
		auditDAO.insertAudit();
		
		auditDAO.getAudits();

	}

}
