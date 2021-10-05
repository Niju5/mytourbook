package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mytourbook.entities.Report;
import com.spring.mytourbook.service.IReportService;

@RestController
@RequestMapping("/api")

public class ReportController {
	@Autowired
	IReportService rservice;
	@PostMapping("/areport")
	public Report addReport(@RequestBody Report report) {
		return rservice.addReport(report);
	}
	@DeleteMapping("/dreport/{reportId}")
	public String deleteReport(@PathVariable Long reportId) {
		return rservice.deleteReport(reportId);
	}
	@GetMapping("/vreport/{reportId}")
	public Optional<Report> viewReport(@PathVariable Long reportId) {
		return rservice.viewReport(reportId);
	}
	@GetMapping("/vreports")
	public List<Report> viewAllReports(){
		return rservice.viewAllReports();}
	
}
