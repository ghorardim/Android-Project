package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main21Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,T,R1,I,A,N;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        T = findViewById(R.id.btnT);
        R1 = findViewById(R.id.btnR);
        I = findViewById(R.id.btnI);
        A = findViewById(R.id.btnA);
        N = findViewById(R.id.btnN);
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "T";
                txt.setText(str);
            }
        });
        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "R";
                txt.setText(str);
            }
        });
        I.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "I";
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
        N.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "N";
                txt.setText(str);
            }
        });



        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.train);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("TRAIN")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main21Activity.this,Main22Activity.class);
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
