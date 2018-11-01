package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main9Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,H,O,U,S,E;
    private String str = "";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        E = findViewById(R.id.btnE);
        H = findViewById(R.id.btnH);
        O = findViewById(R.id.btnO);
        U = findViewById(R.id.btnU);
        S = findViewById(R.id.btnS);
        E.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "E";
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
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "O";
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
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "S";
                txt.setText(str);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.house);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("HOUSE")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Main9Activity.this,Main10Activity.class);
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
