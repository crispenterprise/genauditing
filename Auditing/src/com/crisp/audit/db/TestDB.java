package com.crisp.audit.db;

import com.generic.audit.AuditObj;

public class TestDB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AuditObj audit = new AuditObj();
		
		audit.setDbHost("localhost");
		audit.setDbUsername("root");
		audit.setDbName("genaudit");
		audit.setDbPassword("b18cintegra");
		audit.setDbPort(3306);
		audit.setUsername("Church MIS");
		audit.setComments("Offering By Cassandra");
		audit.setEvent("Process Offering");
		
		
		AuditDAO auditDAO = new AuditDAO(audit);
		
		boolean responseFlag = auditDAO.insertAudit(audit);
		
		auditDAO.getAudits();

	}

}
