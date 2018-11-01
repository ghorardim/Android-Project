package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,B,A,L1,L2;
    private String str = "";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        B = findViewById(R.id.btnB);
        A = findViewById(R.id.btnA);
        L1 = findViewById(R.id.btnL1);
        L2 = findViewById(R.id.btnL2);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "B";
                txt.setText(str);
            }
        });
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "A";
                txt.setText(str);
            }
        });
        L1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "L";
                txt.setText(str);
            }
        });
        L2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "L";
                txt.setText(str);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ball);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("BALL")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Wrong Answer!!!!",Toast.LENGTH_LONG).show();
                    str = "";
                    txt.setText(str);
                }
            }
        });
    }
}
