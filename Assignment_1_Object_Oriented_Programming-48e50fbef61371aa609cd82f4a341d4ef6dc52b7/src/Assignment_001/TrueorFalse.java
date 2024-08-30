package Assignment_001;

/*
    Child class of Quiz_ent that collects True or False questions
 */
public class TrueorFalse extends Quiz_ent {
    public void displayAnswers(String correct_ans, String [] incorrect_ans) {
        question_answers = new String[2];
        question_answers[0] = "True";
        question_answers[1] = "False";
        if(correct_ans.equals("True")) {
            correct_answers = 0;
        }
        else {
            correct_answers = 1;
        }
    }

    @Override
    public boolean correct_answers(int answer) {
        return false;
    }

}
