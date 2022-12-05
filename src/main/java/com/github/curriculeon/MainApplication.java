package com.github.curriculeon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.curriculeon.utils.FileUtils;

public class MainApplication {
    public static void main(String[] args) {
        ObjectMapper om = new ObjectMapper();
        String myJsonString = FileUtils.readFile(args[0]);
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
