package com.github.curriculeon;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quizzes implements Iterable<Quiz> {
    private List<Quiz> quizzes;

    public Quizzes() {
        this(new ArrayList<>());
    }

    public Quizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    public List<Quiz> getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(List<Quiz> quizzes) {
        this.quizzes = quizzes;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Quiz> iterator() {
        return quizzes.iterator();
    }
}