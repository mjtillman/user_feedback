package com.user_feedback.services;

import com.user_feedback.entities.Feedback;
import com.user_feedback.repositories.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

  @Autowired
  private FeedbackRepository feedbackRepository;

  public Iterable<Feedback> getAllFeedbacks() {
    return feedbackRepository.findAll();
  }

  public Feedback saveFeedback(Feedback newFeedback) {
    return feedbackRepository.save(newFeedback);
  }
}
