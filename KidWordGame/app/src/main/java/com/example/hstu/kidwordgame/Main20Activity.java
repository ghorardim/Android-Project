package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main20Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,S,H,I,P;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        S = findViewById(R.id.btnS);
        H = findViewById(R.id.btnH);
        I = findViewById(R.id.btnI);
        P = findViewById(R.id.btnP);
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "S";
                txt.setText(str);
            }
        });
        H.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "H";
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
        P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "P";
                txt.setText(str);
            }
        });



        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ship);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("SHIP")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                      Intent intent = new Intent(Main20Activity.this,Main21Activity.class);
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
