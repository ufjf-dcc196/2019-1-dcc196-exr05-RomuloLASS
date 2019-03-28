package br.ufjf.exercicio003;

import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txt_turn = findViewById(R.id.textView6);
    private TextView txt_o_victory = findViewById(R.id.textView4);
    private TextView txt_x_victory = findViewById(R.id.textView4);

    private int table[][] = new int[3][3];
    private int countX = 0;
    private int countO = 0;
    private int player = 0;

    private Button btn1 = findViewById(R.id.button);
    private Button btn2 = findViewById(R.id.button2);
    private Button btn3 = findViewById(R.id.button3);
    private Button btn4 = findViewById(R.id.button4);
    private Button btn5 = findViewById(R.id.button5);
    private Button btn6 = findViewById(R.id.button6);
    private Button btn7 = findViewById(R.id.button7);
    private Button btn8 = findViewById(R.id.button8);
    private Button btn9 = findViewById(R.id.button9);

    private void startTable(){
        for(int i=0; i<=2; i++){
            for(int j=0; j<=2; j++){
                table[i][j] = 3;
            }
        }
    }

    private void verifyPlayer(){
        if (player == 0){
            txt_turn.setText(R.string.txt_turn_x);
        }
        else{
            txt_turn.setText(R.string.txt_turn_o);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_turn.setText(R.string.txt_turn_x);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn1.setText("X");
                    btn1.setClickable(false);
                    table[0][0] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn1.setText("O");
                    btn1.setClickable(false);
                    table[0][0] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn2.setText("X");
                    btn2.setClickable(false);
                    table[0][1] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn2.setText("O");
                    btn2.setClickable(false);
                    table[0][1] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn3.setText("X");
                    btn3.setClickable(false);
                    table[0][2] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn3.setText("O");
                    btn3.setClickable(false);
                    table[0][2] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn4.setText("X");
                    btn4.setClickable(false);
                    table[1][0] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn4.setText("O");
                    btn4.setClickable(false);
                    table[1][0] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn5.setText("X");
                    btn5.setClickable(false);
                    table[1][1] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn5.setText("O");
                    btn5.setClickable(false);
                    table[1][1] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn6.setText("X");
                    btn6.setClickable(false);
                    table[1][2] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn6.setText("O");
                    btn6.setClickable(false);
                    table[1][2] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn7.setText("X");
                    btn7.setClickable(false);
                    table[2][0] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn7.setText("O");
                    btn7.setClickable(false);
                    table[2][0] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn8.setText("X");
                    btn8.setClickable(false);
                    table[2][1] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn8.setText("O");
                    btn8.setClickable(false);
                    table[0][0] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player == 0){
                    btn9.setText("X");
                    btn9.setClickable(false);
                    table[2][2] = 0;
                    player = 1;
                    verifyPlayer();
                    verify();
                }
                else{
                    btn9.setText("O");
                    btn9.setClickable(false);
                    table[2][2] = 1;
                    player = 0;
                    verifyPlayer();
                    verify();
                }
            }
        });
    }

    private void verify(){
        if(table[0][0]==table[0][1] && table[0][0]==table[0][2]){
            if(table[0][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[1][0]==table[1][1] && table[1][0]==table[1][2]){
            if(table[1][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[2][0]==table[2][1] && table[2][0]==table[2][2]){
            if(table[1][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[0][0]==table[1][0] && table[0][0]==table[2][0]){
            if(table[0][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[0][1]==table[1][1] && table[0][1]==table[2][1]){
            if(table[0][1]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[0][2]==table[1][2] && table[0][2]==table[2][2]){
            if(table[0][2]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[0][0]==table[1][1] && table[0][0]==table[2][2]){
            if(table[0][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }

        if(table[2][0]==table[1][1] && table[2][0]==table[0][2]){
            if(table[2][0]==0){
                countX+=1;
                result(0);
            }
            else if(table[2][0]==1){
                countO+=1;
                result(1);
            }
        }
    }

    private void result(int r){
        Handler handler = new Handler();
        if(r==0){
            txt_x_victory.setText(txt_x_victory.getText()+" "+countX);
            btn9.setClickable(true);
            player = 1;
        }
        else if(r==1){
            txt_o_victory.setText(txt_o_victory.getText()+" "+countO);
            btn9.setClickable(true);
            player = 0;
        }
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                recreate();
            }
        },5000);
    }
}
