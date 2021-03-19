package com.user_feedback.controllers;

import com.user_feedback.entities.Feedback;
import com.user_feedback.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeedbackController {

   @Autowired
   FeedbackService feedbackService;

   @GetMapping("/feedback")
   @ResponseBody
   public Iterable<Feedback> getAllFeedbacks() {
      return feedbackService.getAllFeedbacks();
   }

  @PostMapping("/feedback")
  public Feedback addNewFeedback(@RequestBody Feedback newFeedback) {
    return (feedbackService.saveFeedback(newFeedback));
  }
}
