package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,G,O,A,T;
    private String str = "";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        G = findViewById(R.id.btnG);
        T = findViewById(R.id.btnT);
        O = findViewById(R.id.btnO);
        A = findViewById(R.id.btnA);
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "G";
                txt.setText(str);
            }
        });
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "T";
                txt.setText(str);
            }
        });
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "O";
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
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.goat);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("GOAT")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Main8Activity.this,Main9Activity.class);
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
