package Assignment_001;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz_start {
    private ArrayList<Quiz_ent> question;
    private int score;
    private String name;

    private int current_question;
    private int capacity;

    public void startNewQuiz() {
        question_extraction extractor = new question_extraction();
        quiz_leaderboard mostAnswers = new quiz_leaderboard();
        quiz_leaderboard bestavgScore = new quiz_leaderboard();
        question = extractor.getQuiz();
        score = 0;
        current_question = 0;


    }
    public boolean nextQuestion(){
        return current_question < 10;
    }
    public void Start(){
        startNewQuiz();
        while(nextQuestion()) {
            Quiz_ent questions = question.get(current_question);
            questions.display_please();
            Scanner scan = new Scanner(System.in);
            System.out.print("Answer: ");
            int answer = scan.nextInt();
            if(questions.correct_answers(answer)) {
                score++;
            }
        }
        System.out.println("Score: " + score);
    }

}
