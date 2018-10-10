package com.iig.gcp.casem.dto;

public class EmployeeDTO {
	private String AlertId;
	private String employeeId;
	private String EmployeeName;
	private String expenseAmount;
	private String DateGE;
	private String publicOfficial;
	private String expenseReportId;
	private String justification;
	private String costCentreCode;
	private String authorisingManager;
	private String attendeeStaffId;
	private String attendeeFullName;
	private String status;
	private String priority;
	private String timestamp;
	
	public String getAlertId() {
		return AlertId;
	}
	public void setAlertId(String alertId) {
		AlertId = alertId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getExpenseAmount() {
		return expenseAmount;
	}
	public void setExpenseAmount(String expenseAmount) {
		this.expenseAmount = expenseAmount;
	}
	public String getDateGE() {
		return DateGE;
	}
	public void setDateGE(String dateGE) {
		DateGE = dateGE;
	}
	public String getPublicOfficial() {
		return publicOfficial;
	}
	public void setPublicOfficial(String publicOfficial) {
		this.publicOfficial = publicOfficial;
	}
	public String getExpenseReportId() {
		return expenseReportId;
	}
	public void setExpenseReportId(String expenseReportId) {
		this.expenseReportId = expenseReportId;
	}
	public String getJustification() {
		return justification;
	}
	public void setJustification(String justification) {
		this.justification = justification;
	}
	public String getCostCentreCode() {
		return costCentreCode;
	}
	public void setCostCentreCode(String costCentreCode) {
		this.costCentreCode = costCentreCode;
	}
	public String getAuthorisingManager() {
		return authorisingManager;
	}
	public void setAuthorisingManager(String authorisingManager) {
		this.authorisingManager = authorisingManager;
	}
	public String getAttendeeStaffId() {
		return attendeeStaffId;
	}
	public void setAttendeeStaffId(String attendeeStaffId) {
		this.attendeeStaffId = attendeeStaffId;
	}
	public String getAttendeeFullName() {
		return attendeeFullName;
	}
	public void setAttendeeFullName(String attendeeFullName) {
		this.attendeeFullName = attendeeFullName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
