package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main13Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,L,I,O,N;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        L = findViewById(R.id.btnL);
        I = findViewById(R.id.btnI);
        O = findViewById(R.id.btnO);
        N = findViewById(R.id.btnN);
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "L";
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
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "O";
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
                imageView.setImageResource(R.drawable.lion);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("LION")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main13Activity.this,Main14Activity.class);
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
