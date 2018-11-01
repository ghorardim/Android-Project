package com.example.hstu.kidwordgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main18Activity extends AppCompatActivity {
    private TextView txt;
    private Button submit,hint,Q,U1,E1,U2,E2;
    private String str = "";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        imageView = findViewById(R.id.imageID);
        hint = findViewById(R.id.hintID);
        txt =  findViewById(R.id.textID);
        submit = findViewById(R.id.submitID);
        Q = findViewById(R.id.btnQ);
        U1 = findViewById(R.id.btnU1);
        E1 = findViewById(R.id.btnE1);
        U2 = findViewById(R.id.btnU2);
        E2 = findViewById(R.id.btnE2);
        Q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "Q";
                txt.setText(str);
            }
        });
        E1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "E";
                txt.setText(str);
            }
        });
        U1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "U";
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
        U2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str = str + "U";
                txt.setText(str);
            }
        });


        hint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.queue);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(str.equals("QUEUE")){
                    Toast.makeText(getApplicationContext(),"Congratulation!!!!",Toast.LENGTH_LONG).show();
                       Intent intent = new Intent(Main18Activity.this,Main19Activity.class);
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
