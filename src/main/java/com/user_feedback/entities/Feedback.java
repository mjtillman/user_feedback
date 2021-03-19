package com.user_feedback.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="feedback")
@Getter @Setter @NoArgsConstructor
public class Feedback {

  @Id
  @Setter(AccessLevel.PRIVATE)
  @GeneratedValue(strategy= GenerationType.IDENTITY)
  private Long id;

  private String username;

  private int rating;

  private String comments;
}
