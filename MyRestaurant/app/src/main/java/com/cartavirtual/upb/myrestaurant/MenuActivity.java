package com.cartavirtual.upb.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ImageButton btnEntrada= (ImageButton) findViewById(R.id.imageButtonEnt);
        btnEntrada.setOnClickListener(this);
        ImageButton btnPlatos= (ImageButton) findViewById(R.id.imageButtonPlt);
        btnPlatos.setOnClickListener(this);
        ImageButton btnBebidas= (ImageButton) findViewById(R.id.imageButtonBbs);
        btnBebidas.setOnClickListener(this);

    }

    public void lanzarActivity (int idView){

        Intent i ;
        switch (idView){

            case R.id.imageButtonEnt:
                i =new Intent(this, EntradasActivity.class);
                startActivity(i);
                break;
            case R.id.imageButtonPlt:
                i =new Intent(this, PlatosActivity.class);
                startActivity(i);
                break;
            case R.id.imageButtonBbs:
                i =new Intent(this, BebidasActivity.class);
                startActivity(i);
                break;
        }
    }

    @Override
    public void onClick(View view) {
        lanzarActivity (view.getId());
    }
}
