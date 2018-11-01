package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,D,U,C,K;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        D = findViewById(R.id.btnD);
        U = findViewById(R.id.btnU);
        C = findViewById(R.id.btnC);
        K = findViewById(R.id.btnK);
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "D";
                txt.setText(str);
            }
        });
        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "U";
                txt.setText(str);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "C";
                txt.setText(str);
            }
        });
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "K";
                txt.setText(str);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.duck);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("DUCK")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main5Activity.this,Main6Activity.class);
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
