package com.company;

import java.util.Objects;
import java.util.Scanner;

public abstract class Question {

    private String prompt;


    public Question(String prompt) {
        this.prompt = prompt;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    abstract public void displayPrompt();

     abstract public void getResponse(Scanner input);

     abstract public int gradeResponse();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return prompt.equals(question.prompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prompt);
    }

    @Override
    public String toString() {
        return "Question{" +
                "prompt='" + prompt + '\'' +
                '}';
    }
}
