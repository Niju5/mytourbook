package com.spring.mytourbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mytourbook.entities.Feedback;
import com.spring.mytourbook.repository.ICustomerRepository;
import com.spring.mytourbook.repository.IFeedbackRepository;

@Service

public class FeedbackServiceImpl implements IFeedbackService{
	@Autowired
    IFeedbackRepository repo;
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		System.out.println("Successfully saved");
		  return repo.save(feedback);
		
	}

	@Override
	public Optional<Feedback> findByFeedbackId(Long feedbackId) {
		// TODO Auto-generated method stub
		
		  return repo.findById(feedbackId);
		
	}

	@Override
	public Optional<Feedback> findByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		
		  return repo.findById(customerId);
	}

	@Override
	public List<Feedback> viewAllFeedbacks() {
		
		return repo.findAll();
	}

}
