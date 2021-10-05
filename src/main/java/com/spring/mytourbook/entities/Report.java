package com.spring.mytourbook.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="REPORT")
public class Report {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "REPORT_ID")
Long reportId;
String reportType;
String reportName;

public Report(Long reportId, String reportType, String reportName) {
	super();
	this.reportId = reportId;
	this.reportType = reportType;
	this.reportName = reportName;
}
public Long getReportId() {
	return reportId;
}
public void setReportId(Long reportId) {
	this.reportId = reportId;
}
public String getReportType() {
	return reportType;
}
public void setReportType(String reportType) {
	this.reportType = reportType;
}
public String getReportName() {
	return reportName;
}
public void setReportName(String reportName) {
	this.reportName = reportName;
}
public Report() {
	super();
}


}
