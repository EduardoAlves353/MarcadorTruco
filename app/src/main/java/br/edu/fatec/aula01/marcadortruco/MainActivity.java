package br.edu.fatec.aula01.marcadortruco;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView scoreTeamATextView;
    private TextView scoreTeamBTextView;

    private String team;

    private int scoreTeamA;
    private int scoreTeamB;

    private Button a_1;
    private Button a_3;
    private Button a_6;
    private Button a_9;
    private Button a_12;
    private Button b_1;
    private Button b_3;
    private Button b_6;
    private Button b_9;
    private Button b_12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreTeamA = 0;
        scoreTeamB = 0;
        scoreTeamATextView = findViewById(R.id.score_yeam_a);
        scoreTeamBTextView = findViewById(R.id.score_yeam_b);

        a_1 = findViewById(R.id.aumentarUmPontoTimeA);
        a_3 = findViewById(R.id.aumentarTresPontoTimeA);
        a_6 = findViewById(R.id.aumentarSeisPontoTimeA);
        a_9 = findViewById(R.id.aumentarNovePontoTimeA);
        a_12 = findViewById(R.id.aumentarDozePontoTimeA);
        b_1 = findViewById(R.id.aumentarUmPontoTimeB);
        b_3 = findViewById(R.id.aumentarTresPontoTimeB);
        b_6 = findViewById(R.id.aumentarSeisPontoTimeB);
        b_9 = findViewById(R.id.aumentarNovePontoTimeB);
        b_12 = findViewById(R.id.aumentarDozePontoTimeB);

    }

    public void ScoreTeam(String team, int P) {
        if (team.equals("A")){
            if (P == 1){
                scoreTeamA += 1;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
            if (P == 3){
                scoreTeamA += 3;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
            if (P == 6){
                scoreTeamA += 6;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
            if (P == 9){
                scoreTeamA += 9;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
            if (P == 12){
                scoreTeamA += 12;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
        } if (team.equals("B")){
            if (P == 1){
                scoreTeamB += 1;
                scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
            }
            if (P == 3){
                scoreTeamB += 3;
                scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
            }
            if (P == 6){
                scoreTeamA += 6;
                scoreTeamATextView.setText(String.valueOf(scoreTeamA));
            }
            if (P == 9){
                scoreTeamB += 9;
                scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
            }
            if (P == 12){
                scoreTeamB += 12;
                scoreTeamBTextView.setText(String.valueOf(scoreTeamB));
            }
        }
    }

    public void zerorPontos(View v) {
        scoreTeamA = 0;
        scoreTeamATextView.setText(String.valueOf(scoreTeamA));
    }

    public void aumentarUmPontoTimeA(View view) {
        ScoreTeam("A", 1);
    }

    public void aumentarTresPontoTimeA(View view) {
        ScoreTeam("A", 3);
    }

    public void aumentarSeisPontoTimeA(View view) {
        ScoreTeam("A", 6);
    }

    public void aumentarNovePontoTimeA(View view) {
        ScoreTeam("A", 9);
    }

    public void aumentarDozePontoTimeA(View view) {
        ScoreTeam("A", 12);
    }

    public void aumentarUmPontoTimeB(View view) {
        ScoreTeam("B", 1);
    }

    public void aumentarTresPontoTimeB(View view) {
        ScoreTeam("B", 3);
    }

    public void aumentarSeisPontoTimeB(View view) {
        ScoreTeam("B", 6);
    }

    public void aumentarNovePontoTimeB(View view) {
        ScoreTeam("B", 9);
    }

    public void aumentarDozePontoTimeB(View view) {
        ScoreTeam("B", 12);
    }
}
