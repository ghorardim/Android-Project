package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main12Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,K,I,T,E;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        K = findViewById(R.id.btnK);
        I = findViewById(R.id.btnI);
        T = findViewById(R.id.btnT);
        E = findViewById(R.id.btnE);
        K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "K";
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
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "T";
                txt.setText(str);
            }
        });
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "E";
                txt.setText(str);
            }
        });


        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.kite);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("KITE")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main12Activity.this,Main13Activity.class);
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
