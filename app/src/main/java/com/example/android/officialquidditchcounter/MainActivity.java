package com.example.android.officialquidditchcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int scoreTeamGry = 0;
    int scoreTeamSly = 0;
    int foulGry = 0;
    int foulSly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//when goal button is clicked, add a goal with a value of 10 to Gryffindor

    public void goalGry(View v) {
        scoreTeamGry = scoreTeamGry + 10;
        displayForTeamA(scoreTeamGry);
    }
//when snitch button is clicked, add a score of 150 to Gryffindor
    public void snitchGry(View v) {
        scoreTeamGry = scoreTeamGry + 150;
        displayForTeamA(scoreTeamGry);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
//when goal button is clicked, add a goal with a value of 10 to Slytherin
    public void goalSly(View v) {
        scoreTeamSly = scoreTeamSly + 10;
        displayForTeamB(scoreTeamSly);
    }

//when snitch button is clicked, add a score of 150 to Slytherin

    public void snitchSly(View v) {
        scoreTeamSly = scoreTeamSly + 150;
        displayForTeamB(scoreTeamSly);

    }


    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_2);
        scoreView.setText(String.valueOf(score));

    }
//when foul button is clicked, add foul to Gryffindor

    public void addFoulForGry(View v) {
        foulGry = foulGry + 1;
        displayFoulForTeamA(foulGry);
    }
//when foul button is clicked, add foul to Slytherin
    public void addFoulForSly(View v) {
        foulSly = foulSly + 1;
        displayFoulForTeamB(foulSly);
    }

//when startover button is clicked, score resets
    public void startOver(View v) {
        scoreTeamGry = 0;
        scoreTeamSly = 0;
        foulGry = 0;
        foulSly = 0;
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);


    }

}