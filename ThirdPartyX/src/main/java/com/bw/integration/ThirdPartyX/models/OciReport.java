package com.bw.integration.ThirdPartyX.models;

public class OciReport {
	String reportId;
	String actor;
	String report;
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nreportId:"+reportId);
		sb.append("\nactor:"+actor);
		sb.append("\nreport:"+report);
		return sb.toString();
	}
	
	
}
