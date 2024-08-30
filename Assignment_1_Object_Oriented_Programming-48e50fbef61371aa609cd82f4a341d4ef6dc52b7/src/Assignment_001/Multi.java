package Assignment_001;

import java.util.Random;

/*
    Child class of Quiz_ent that contains multiple choice questions
 */
public class Multi extends Quiz_ent{
    public void displayAnswers(String correct_ans, String[] incorrect_ans) {
        Random rdm = new Random();
        question_answers = new String[4];
        int correct = rdm.nextInt(0, 4);
        int incorrect = 0;
        for(int y = 0; y < question_answers.length; y++) {
            if(y == correct) {
                question_answers[y] = correct_ans;
            }
            else {
                question_answers[y] = incorrect_ans[incorrect];
                incorrect++;
            }
        }
        correct_answers = correct;

    }

    @Override
    public boolean correct_answers(int answer) {
        return false;
    }
}
