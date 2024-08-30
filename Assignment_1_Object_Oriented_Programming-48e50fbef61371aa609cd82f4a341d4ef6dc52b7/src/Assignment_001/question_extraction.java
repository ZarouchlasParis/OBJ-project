package Assignment_001;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URL;

import java.net.MalformedURLException;
import java.util.ArrayList;

public class question_extraction {

    private Error_logs logger;

    public question_extraction() {
        logger = new Error_logs();
    }
    /*
        Accesses the API, gets 10 questions of the true/false and multiple choice type
     */

    public JSONArray apiExtract(){
        try{
            URL url = new URL("https://opentdb.com/api.php?amount=10");
            InputStreamReader is = new InputStreamReader(url.openStream());
            JSONParser parser = new JSONParser();
            JSONObject thing = (JSONObject) parser.parse(is);
            JSONArray quiz_api = (JSONArray) thing.get("results");
            return quiz_api;

        } catch (MalformedURLException m) {
            System.out.println("Couldn't locate the given URL");
        } catch (IOException m) {
            return null;
        } catch (ParseException m) {
            System.out.println("Couldn't process the information that was given");
        }    return null;
    }
    /*
        Array list that collects the questions and displays their answers
     */
    public ArrayList<Quiz_ent> getQuiz() {
        JSONArray quizz = apiExtract();
        ArrayList<Quiz_ent> questions = new ArrayList<>();
        for(Object obj : quizz) {
            JSONObject thing = (JSONObject) obj;
            String question_type = (String) thing.get("type");
            Quiz_ent quest;
            int incorrect_length = 1;
            if(question_type.equals("multiple")) {
                quest = new Multi();
                incorrect_length = 3;
            }
            else {
                quest = new TrueorFalse();
            }
            quest.questions = (String) thing.get("question");
            String correct = (String) thing.get("correct_answer");
            String [] incorrect = new String[incorrect_length];
            JSONArray inn = (JSONArray) thing.get("incorrect_answers");
            for(int y = 0; y < incorrect_length; y++) {
                String answer = (String) inn.get(y);
                incorrect[y] = answer;
            }
            quest.displayAnswers(correct, incorrect);
            questions.add(quest);
        }
        return questions;
    }
}
