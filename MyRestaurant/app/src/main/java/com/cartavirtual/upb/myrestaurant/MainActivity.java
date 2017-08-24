package com.cartavirtual.upb.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMap = (Button) findViewById(R.id.buttonMyMap);
        btnMap.setOnClickListener(this);
        Button btnMenu = (Button) findViewById(R.id.buttonMymenu);
        btnMenu.setOnClickListener(this);
        Button btnExit = (Button) findViewById(R.id.buttonExit);
        btnExit.setOnClickListener(this);
    }

    public void lanzarActivity (int idView){

        Intent i ;
        switch (idView){
            case R.id.buttonMyMap:
                i =new Intent(this, MapsActivity.class);
                startActivity(i);
                break;
            case R.id.buttonMymenu:
                i =new Intent(this, MenuActivity.class);
                startActivity(i);
                break;
            case R.id.buttonExit:
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
