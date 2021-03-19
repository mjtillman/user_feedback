package com.user_feedback.repositories;

import com.user_feedback.entities.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
