package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main16Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,O,L,W;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        O = findViewById(R.id.btnO);
        W = findViewById(R.id.btnW);
        L = findViewById(R.id.btnL);
        O.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "O";
                txt.setText(str);
            }
        });
        W.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "W";
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
                imageView.setImageResource(R.drawable.owl);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("OWL")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main16Activity.this,Main17Activity.class);
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
