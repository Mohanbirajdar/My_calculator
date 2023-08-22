package com.example.my_calci;

import androidx.appcompat.app.AppCompatActivity;
import com.faendir.rhino_android.RhinoAndroidHelper;
//import com.faendir.rhino;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.ImporterTopLevel;
import org.mozilla.javascript.Scriptable;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    ImageView btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_zero;
    ImageView btn_add,btn_minus,btn_dot,btn_multiplication,btn_eql,btn_ac,btn_clr,btn_divide;
    TextView outputtx;
    TextView inputtx;
    String finalresult;
    String data;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1=findViewById(R.id.btn_1);
        btn_2=findViewById(R.id.btn_2);
        btn_3=findViewById(R.id.btn_3);
        btn_4=findViewById(R.id.btn_4);
        btn_5=findViewById(R.id.btn_5);
        btn_6=findViewById(R.id.btn_6);
        btn_7=findViewById(R.id.btn_7);
        btn_8=findViewById(R.id.btn_8);
        btn_9=findViewById(R.id.btn_9);
        btn_zero=findViewById(R.id.btn_zero);
        btn_ac=findViewById(R.id.btn_ac);
        btn_eql=findViewById(R.id.btn_eql);
        btn_multiplication=findViewById(R.id.btn_multiplication);
        btn_minus=findViewById(R.id.btn_minus);
        btn_dot=findViewById(R.id.btn_dot);
        btn_add=findViewById(R.id.btn_add);
        outputtx=findViewById(R.id.output);
        inputtx=findViewById(R.id.input);
        btn_clr=findViewById(R.id.btn_clr);
        btn_divide=findViewById(R.id.btn_divide);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "1");

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "2");

            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "3");

            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "4");

            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "5");

            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "6");

            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "7");

            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "8");

            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "9");

            }
        });
        btn_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(String.format(data,"%s0"));

            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "+");

            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "-");

            }
        });
        btn_multiplication.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "*");

            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + ".");

            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText("");
                outputtx.setText("");

            }
        });

        btn_clr.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + "");

            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                data =inputtx.getText().toString();
                inputtx.setText(data + '÷');

            }
        });
        btn_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data=inputtx.getText().toString();
                //Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
                //data=data.replace("*","*");
                data=data.replace("÷","/");
                //data=data.replace("-","-");
                //data=data.replace("+","+");
                Context rhino = Context.enter();
                try {


                    rhino.setOptimizationLevel(-1);
                    Scriptable scriptable = rhino.initStandardObjects();
                    finalresult = rhino.evaluateString(scriptable, data, "JavaScript", 1, "null").toString();
                    outputtx.setText(finalresult.toString());
                }finally {
                    Context.exit();
                }

                //Toast.makeText(MainActivity.this, ""+finalresult, Toast.LENGTH_SHORT).show();





            }
        });


    }
}