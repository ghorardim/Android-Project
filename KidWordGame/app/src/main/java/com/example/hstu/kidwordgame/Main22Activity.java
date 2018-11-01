package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,U,F,O;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        U = findViewById(R.id.btnU);
        F = findViewById(R.id.btnF);
        O = findViewById(R.id.btnO);

        U.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "U";
                txt.setText(str);
            }
        });
        F.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "F";
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




        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.ufo);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("UFO")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main22Activity.this,Main23Activity.class);
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
