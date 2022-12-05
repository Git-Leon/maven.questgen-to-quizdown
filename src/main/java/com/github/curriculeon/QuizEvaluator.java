package com.github.curriculeon;

import java.util.List;
import java.util.StringJoiner;

public class QuizEvaluator {
    private Quiz quiz;

    public QuizEvaluator(Quiz quiz) {
        this.quiz = quiz;
    }

    public String toQuizDown() {
        StringJoiner stringJoiner = new StringJoiner("\n")
                .add("### " + quiz.getQuestion())
                .add("- [X] " + quiz.getAnswer());
        for(String distractor : quiz.getDistractors()) {
            stringJoiner.add("- [ ] " + distractor);
        }
        return stringJoiner.toString();
    }
}
