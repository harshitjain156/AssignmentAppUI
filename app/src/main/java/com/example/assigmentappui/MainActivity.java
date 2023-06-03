package com.example.assigmentappui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
LinearLayout individual1,individual2,professional1,professional2,merchant1,merchant2;
CardView card1,card2,card3;
TextView btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1=findViewById(R.id.individualCard);
        card2=findViewById(R.id.professionalCard);
        card3=findViewById(R.id.merchantCard);
        individual1=findViewById(R.id.individualLayout1);
        individual2=findViewById(R.id.individualLayout2);
        professional1=findViewById(R.id.professionalLayout1);
        professional2=findViewById(R.id.professionalLayout2);
        merchant1=findViewById(R.id.MerchantLayout1);
        merchant2=findViewById(R.id.MerchantLayout2);
        individual1.setGravity(Gravity.CENTER);
        professional1.setGravity(Gravity.CENTER);
        merchant1.setGravity(Gravity.CENTER);
        individual2.setVisibility(View.GONE);
        professional2.setVisibility(View.GONE);
        merchant2.setVisibility(View.GONE);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                individual1.setGravity(Gravity.NO_GRAVITY);
                individual2.setVisibility(View.VISIBLE);
                professional2.setVisibility(View.GONE);
                merchant2.setVisibility(View.GONE);
                professional1.setGravity(Gravity.CENTER);
                merchant1.setGravity(Gravity.CENTER);


            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                professional1.setGravity(Gravity.NO_GRAVITY);
                professional2.setVisibility(View.VISIBLE);
                individual1.setGravity(Gravity.CENTER);
                individual2.setVisibility(View.GONE);
                merchant2.setVisibility(View.GONE);
                merchant1.setGravity(Gravity.CENTER);



            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                merchant1.setGravity(Gravity.NO_GRAVITY);
                merchant2.setVisibility(View.VISIBLE);
                individual1.setGravity(Gravity.CENTER);
                individual2.setVisibility(View.GONE);
                professional2.setVisibility(View.GONE);
                professional1.setGravity(Gravity.CENTER);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}