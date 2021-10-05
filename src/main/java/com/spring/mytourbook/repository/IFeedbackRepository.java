package com.spring.mytourbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mytourbook.entities.Feedback;

public interface IFeedbackRepository extends JpaRepository<Feedback,Long> {

}
