package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultipleChoice extends Question{

    private String[] choices;
    private int response;
    private int answer;

    public MultipleChoice(String prompt, int answer, String[] choices) {
        super(prompt);
        this.answer = answer;
        this.choices = choices;
    }

    public String[] getChoices() {
        return choices;
    }

    public void displayPrompt() {
        System.out.println(this.getPrompt());
        for (int i = 0; i<choices.length; i++) {
            System.out.println(i+1+") "+choices[i]);
        }
    }

    public void getResponse(Scanner input) {
        this.response = input.nextInt();
    }

    public int gradeResponse() {
        return this.response == this.answer ? 1 : 0;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

//    public void displayChoices() {
//        for (int i = 0; i<choices.length; i++) {
//            System.out.println(i+1+") "+choices[i]);
//        }
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MultipleChoice that = (MultipleChoice) o;
        return Arrays.equals(choices, that.choices);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(choices);
        return result;
    }

    @Override
    public String toString() {
        return "MultipleChoice{" +
                "choices=" + Arrays.toString(choices) +
                '}';
    }

    //    String values=null;
//        for (String choice : choices) {
//        if (values == null) {
//            values = choice;
//        } else {
//            values = values + ", " + choice;
//        }
//    }
//        return values;
}
