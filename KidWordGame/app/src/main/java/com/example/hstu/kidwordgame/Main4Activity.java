package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,C,A,T;
    private String str = "";
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        C = findViewById(R.id.btnC);
        A = findViewById(R.id.btnA);
        T = findViewById(R.id.btnT);
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "A";
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
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "T";
                txt.setText(str);
            }
        });
        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cat);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("CAT") || str.equals("ACT")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(Main4Activity.this,Main5Activity.class);
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
