package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import com.spring.mytourbook.entities.Report;

public interface IReportService {
	public Report addReport(Report report);

	public List<Report> viewAllReports();
	String deleteReport(Long reportId);
	Optional<Report> viewReport(Long reportId);
	}
