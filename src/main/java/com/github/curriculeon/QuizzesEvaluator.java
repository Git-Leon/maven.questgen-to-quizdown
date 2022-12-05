package com.github.curriculeon;

import java.util.StringJoiner;

public class QuizzesEvaluator {
    private Quizzes quizzes;

    public QuizzesEvaluator(Quizzes quizzes) {
        this.quizzes = quizzes;
    }

    public String toQuizDown() {
        StringJoiner stringJoiner = new StringJoiner("\n\n\n");
        for(Quiz quiz : quizzes) {
            stringJoiner.add(new QuizEvaluator(quiz).toQuizDown());
        }
        return stringJoiner.toString();
    }
}
