package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnplus,btndiv,btnmult,btnsub,btnc,btnequal;
TextView snc;
boolean addition,subtract,multiple,division;
float valueone,valuetwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnplus = (Button) findViewById(R.id.btnplus);
        btndiv = (Button) findViewById(R.id.btndiv);
        btnmult = (Button) findViewById(R.id.btnmult);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnc = (Button) findViewById(R.id.btnc);
        btnequal = (Button) findViewById(R.id.btnequal);
        snc = (TextView) findViewById(R.id.snc);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"2");
            }

        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText(snc.getText()+"0");
            }
        });

        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(snc == null){
                    snc.setText("");
                }else{
                    valueone = Float.parseFloat(snc.getText() + "");
                    addition = true;
                    snc.setText(null);

                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(snc.getText() + "");
                subtract = true;
                snc.setText(null);
            }
        });
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(snc.getText() + "");
                multiple = true;
                snc.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Float.parseFloat(snc.getText()+"");
                division = true;
                snc.setText(null);
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuetwo = Float.parseFloat(snc.getText()+"");

                if(addition == true){
                    snc.setText(valueone+valuetwo+"");
                    addition = false;
                }
                if(subtract==true){
                    snc.setText(valueone-valuetwo+"");
                    subtract=false;
                }
                if(multiple==true){
                    snc.setText(valueone*valuetwo+"");
                    multiple=false;
                }
                if(division==true){
                    snc.setText(valueone/valuetwo+"");
                    division=false;
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snc.setText("");
            }
        });


    }
}