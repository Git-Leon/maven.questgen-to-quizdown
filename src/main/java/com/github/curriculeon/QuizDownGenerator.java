package com.github.curriculeon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
import com.github.curriculeon.utils.DirectoryReference;

public class QuizDownGenerator implements Runnable {
    public void run() {
        ObjectMapper om = new ObjectMapper();
        String myJsonString = DirectoryReference.RESOURCE_DIRECTORY.readFileFromDirectory("quiz.interface-abstract-class.json");
        try {
            Quizzes quizzes = om.readValue(myJsonString, Quizzes.class);
            QuizzesEvaluator evaluator = new QuizzesEvaluator(quizzes);
            String quizdown = evaluator.toQuizDown();
            System.out.println(quizdown);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
