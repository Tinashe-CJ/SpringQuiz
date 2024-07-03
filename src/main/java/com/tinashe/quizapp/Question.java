package com.tinashe.quizapp;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity //used to map the vars to the DB
@Data //leverages lombok to create getters, setters and toString method for these vars
public class Question {

    @Id //depicts the Primary key in our DB
    @GeneratedValue(strategy = GenerationType.IDENTITY) // allows us to Edit out DB
    private String id;
    private String questionTitle;
    private String category;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
}
