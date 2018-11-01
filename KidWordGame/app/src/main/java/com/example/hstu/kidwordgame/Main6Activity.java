package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,E1,A,G,L,E2;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        E1 = findViewById(R.id.btnE1);
        E2 = findViewById(R.id.btnE2);
        A = findViewById(R.id.btnA);
        G = findViewById(R.id.btnG);
        L = findViewById(R.id.btnL);
        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "E";
                txt.setText(str);
            }
        });
        E2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "E";
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
        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "G";
                txt.setText(str);
            }
        });
        L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "L";
                txt.setText(str);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.eagle);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("EAGLE")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Main6Activity.this,Main7Activity.class);
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
