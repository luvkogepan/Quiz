package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }
    int userScore = 0;
    int totalScore =0;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getUserScore() {
        return userScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public double percentScore() {
        return (this.userScore/this.totalScore)*100;
    }

    public void runQuiz() {
        System.out.println("Ready for your quiz? This quiz has "+this.questions.size()+" questions.");
        Scanner input = new Scanner(System.in);



        for (Question question : questions) {
            question.displayPrompt();
            question.getResponse(input);
            this.userScore += question.gradeResponse();
            this.totalScore++;
        }
        input.close();

        System.out.println("You got "+this.userScore+" out of "+this.totalScore+" correct for a total score of "+this.percentScore()+"%");
    }
}
// Scanner input = new Scanner(System.in);