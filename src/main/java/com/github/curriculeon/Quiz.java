package com.github.curriculeon;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String question;
    private String answer;
    private List<String> distractors;

    public Quiz() {
        this("", "", new ArrayList<>());
    }

    public Quiz(String question, String answer, List<String> distractors) {
        this.question = question;
        this.answer = answer;
        this.distractors = distractors;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<String> getDistractors() {
        return distractors;
    }

    public void setDistractors(List<String> distractors) {
        this.distractors = distractors;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}


