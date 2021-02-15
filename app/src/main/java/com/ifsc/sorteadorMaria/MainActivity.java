package com.ifsc.sorteadorMaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText var1,var2;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        var1 = findViewById(R.id.var1);
        var2 = findViewById(R.id.var2);
        result = findViewById(R.id.Valor);
    }

    public void sortear(View view){
        int num1, num2;
        num1 = Integer.parseInt(var1.getText().toString());
        num2 = Integer.parseInt(var2.getText().toString());
        int sort = new Random().nextInt(((num2-num1)+1)) +num1;
        Log.i("test", Integer.toString(sort));
        result.setText(Integer.toString((sort)));
    }

    public void clean(View view){
        var1.setText("0");
        var2.setText("0");
        result.setText("-");
    }

    public void padrao(View view){
        int sorte = new Random().nextInt(100);
        result.setText(Integer.toString((sorte)));
    }
}