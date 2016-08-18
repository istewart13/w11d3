package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 16/08/2016.
 */
public class Eightball extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mStringButton;
    Button mAPIButton;
    Button mPirateButton;

    Answers mAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mStringButton = (Button)findViewById(R.id.string_button);
        mAPIButton = (Button)findViewById(R.id.api_button);
        mPirateButton = (Button)findViewById(R.id.pirate_button);

        mStringButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "String button clicked!");
                Log.d("Eightball", "The question asked was '" + question + "'");
                mAnswers = new AnswersFromSimpleStrings();
                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(Eightball.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });

        mAPIButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "API button clicked!");
                Log.d("Eightball", "The question asked was '" + question + "'");
                mAnswers = new AnswersFromAPI();
                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(Eightball.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });

        mPirateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "Pirate button clicked!");
                Log.d("Eightball", "The question asked was '" + question + "'");
                mAnswers = new AnswersFromPirate();
                String answer = mAnswers.getAnswer();

                Intent intent = new Intent(Eightball.this, AnswerActivity.class);
                intent.putExtra("answer",answer);
                Log.d("Eightball", "passing through" + answer);
                startActivity(intent);
            }
        });
    }

}
