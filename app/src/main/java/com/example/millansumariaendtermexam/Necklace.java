package com.example.millansumariaendtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Necklace extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_necklace);
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
        switch (v.getId()) {
            case R.id.btn_return:
                Intent intent = new Intent(Necklace.this, MainActivity.class);
                startActivity(intent);
                break;

            case R.id.retailbtn:
                Intent intent2 = new Intent(Necklace.this, Retail.class);
                startActivity(intent2);
                break;

            case R.id.wholesalebtn:
                Intent intent3 = new Intent(Necklace.this, WholeSale.class);
                startActivity(intent3);
                break;
            default: break;
        }
    }
}