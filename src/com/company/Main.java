package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MultipleChoice q1 = new MultipleChoice("What color is an apple?", 2, new String[] {"blue", "red", "white", "black"});
        MultipleChoice q2 = new MultipleChoice("How many states are in the United States", 3, new String[] {"10", "30", "50", "70"});
//        q1.displayPrompt();
//        q1.displayChoices();
        ArrayList<Question> set1 = new ArrayList<Question>();
        set1.add(q1);
        set1.add(q2);

//        ArrayList<Question> set1 = new ArrayList<Question>(Arrays.asList(q1, q2));
        Quiz quiz = new Quiz(set1);
        quiz.runQuiz();
    }
}
