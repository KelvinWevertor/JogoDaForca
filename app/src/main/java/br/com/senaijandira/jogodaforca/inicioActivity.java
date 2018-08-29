package br.com.senaijandira.jogodaforca;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class inicioActivity extends Activity {


    String [] resposta= {"S", "E", "N", "A", "I"};



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inicio);

    }


}
