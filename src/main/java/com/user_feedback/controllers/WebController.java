package com.user_feedback.controllers;

import com.user_feedback.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  @Autowired
  FeedbackService feedbackService;

  @GetMapping("/")
  public String home() {
    return "home";
  }

  @GetMapping("/accepted")
  public String formAccepted() {
    return "accepted";
  }
}
