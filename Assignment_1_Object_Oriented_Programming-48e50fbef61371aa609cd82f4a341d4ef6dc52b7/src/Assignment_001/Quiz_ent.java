package Assignment_001;

import java.util.Random;

/*
This class is created to contain information about the quiz and serves as the parent class for
the different types of question classes
 */
public abstract class Quiz_ent {
    protected String questions;
    protected String [] question_answers;
    protected int correct_answers;

    public abstract void displayAnswers(String correct_ans, String [] incorrect_ans);

    public void display_please() {
        System.out.println("Q: " + questions);
        int i = 1;
        for(String t : question_answers) {
            System.out.println("A:" + i + ": " + t);
            i++;
        }
        System.out.println("Cheat: " + correct_answers);
    }

    public boolean theCorrectAnswer(int answers){
        return correct_answers == answers -1;
    }

    public String toString(){
        String qu = "Q: " + questions;
        for(int i = 0; i < question_answers.length; i++) {
            qu += "\n" + question_answers[i] + " ";
        }
        qu += "||||||||||";
        return qu;
    }

    public abstract boolean correct_answers(int answer);
}

