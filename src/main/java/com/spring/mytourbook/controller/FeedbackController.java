package com.spring.mytourbook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mytourbook.entities.Feedback;
import com.spring.mytourbook.service.IFeedbackService;

@RestController
@RequestMapping("/api")

public class FeedbackController {
	@Autowired
	IFeedbackService fservice;
	@PostMapping("/afeedback")
	public Feedback addFeedback(@RequestBody Feedback feedback) {
		return fservice.addFeedback(feedback);
	}
	@GetMapping("/ffeedback/{feedbackId}")
	public Optional<Feedback> findByFeedbackId(@PathVariable Long feedbackId) {
		return fservice.findByFeedbackId(feedbackId);
	}
	@GetMapping("/ficustomer/{customerId}")
	public Optional<Feedback> findByCustomerId(@PathVariable Long customerId) {
		return fservice.findByCustomerId(customerId);
	}
	@GetMapping("/vfeedbacks")
	public List<Feedback> viewAllFeedbacks(){
		return fservice.viewAllFeedbacks();
		
	}
}
