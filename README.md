# Sorteador-IFSC

package com.ifsc.sorteadorMaria;

//Bibliotecas usadas:
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
    //metodo para iniciar
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setando as variaveis conforme os campos da tela
        var1 = findViewById(R.id.var1);
        var2 = findViewById(R.id.var2);
        //setando o campo que vai exibir o resultado
        result = findViewById(R.id.Valor);
    }

    public void sortear(View view){
        int num1, num2;
        //pegando as variaveis digitadas
        num1 = Integer.parseInt(var1.getText().toString());
        num2 = Integer.parseInt(var2.getText().toString());
        //usando o random para sortear
        int sort = new Random().nextInt(((num2-num1)+1)) +num1;
        //log no console
        Log.i("test", Integer.toString(sort));
        //exibindo o resultado na tela
        result.setText(Integer.toString((sort)));
    }

    public void clean(View view){
    //setando os locais que podem ser alterados para 0 e o visualizador para - para limpar a tela
        var1.setText("0");
        var2.setText("0");
        result.setText("-");
    }

    public void padrao(View view){
    //random padrão de 0 a 100
        int sorte = new Random().nextInt(100);
        result.setText(Integer.toString((sorte)));
    }
