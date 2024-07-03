package com.tinashe.quizapp.controller;

import com.tinashe.quizapp.Question;
import com.tinashe.quizapp.dao.QuestionDao;
import com.tinashe.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    //QuestionDao questionDao;
    QuestionService questionService;

    @GetMapping("allQuestions")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    //allows us to get questions by category and store them
    //we'll pass that categorical question through the method below as a PathVariable
    @GetMapping("category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
