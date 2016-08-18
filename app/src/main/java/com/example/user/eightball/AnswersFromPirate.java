package com.example.user.eightball;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 18/08/2016.
 */
public class AnswersFromPirate extends Answers {

    private ArrayList<String> mAnswers;

    public AnswersFromPirate() {
        super();
    }

    public AnswersFromPirate(ArrayList<String> answers) {
        super(answers);
    }

    @Override
    public void setupAnswers() {
        String[] answers = {
                "Yarghhh!", "Avast!", "Pull me mast!"
        };

        for(String answer: answers) {
            mAnswers.add(answer);
        }
    }
}