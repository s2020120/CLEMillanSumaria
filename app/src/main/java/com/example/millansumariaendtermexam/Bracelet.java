package com.example.millansumariaendtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Bracelet extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracelet);

        Button btnReturn, btnRetail, btnWholeSale;
        btnReturn = (Button) findViewById(R.id.btn_return);
        btnReturn.setOnClickListener(this);

        btnRetail = (Button) findViewById(R.id.retailbtn);
        btnRetail.setOnClickListener(this);

        btnWholeSale = (Button) findViewById(R.id.wholesalebtn);
        btnWholeSale.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Bracelet.this, MainActivity.class);
        startActivity(intent);
        Intent intent2 = new Intent(Bracelet.this, Retail.class);
        startActivity(intent2);
        Intent intent3 = new Intent(Bracelet.this, WholeSale.class);
        startActivity(intent3);
    }
}