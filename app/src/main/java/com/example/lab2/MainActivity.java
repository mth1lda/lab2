package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1, num2, res;
    TextView op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        res=findViewById(R.id.res);
        op=findViewById(R.id.op);
    }

//    public void calculate(View view) {
//        int n = Integer.parseInt(num1.getText().toString());
//        n+=1;
//        tes.setText(n);
//    }

    public void sum(View view) {
        int numa=Integer.parseInt(num1.getText().toString());
        int numb=Integer.parseInt(num2.getText().toString());
        int summ=numa+numb;
        res.setText(Integer.toString(summ));
        op.setText("+");
    }
}