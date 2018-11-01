package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,J,U,G;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        J = findViewById(R.id.btnJ);
        U = findViewById(R.id.btnU);
        G = findViewById(R.id.btnG);
        J.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "J";
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
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "G";
                txt.setText(str);
            }
        });


        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.jug);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("JUG")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main11Activity.this,Main12Activity.class);
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
