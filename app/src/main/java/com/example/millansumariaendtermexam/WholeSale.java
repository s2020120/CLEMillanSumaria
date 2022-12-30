package com.example.millansumariaendtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WholeSale extends AppCompatActivity implements View.OnClickListener {
    EditText etMaterials, etGems;
    String strMaterials, strGems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whole_sale);
        Button btnComputeWS;
        btnComputeWS = (Button) findViewById(R.id.computebtnWS);

        btnComputeWS.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Computing....", Toast.LENGTH_SHORT).show();
        ComputeWS();
    }
    public void ComputeWS() {
        etMaterials = (EditText) findViewById(R.id.editTextNumber3);
        etGems = (EditText) findViewById(R.id.editTextNumber4);
        if(etMaterials.getText().toString().isEmpty() || etGems.getText().toString().isEmpty()){
            strMaterials = "0";
            strGems = "0";
        }else{
            strMaterials = etMaterials.getText().toString();
            strGems = etGems.getText().toString();
        }

        int rawMaterials = Integer.parseInt(strMaterials);
        int rawGems = Integer.parseInt(strGems);

        int Price = rawGems+rawMaterials;
        Bundle args = new Bundle();
        args.putString("result", String.valueOf(Price));

        // Create a dialog instance
        DialogFragmentCustom dialogFragmentImp = new DialogFragmentCustom();
        // Pass on dialog argument(args), the result
        dialogFragmentImp.setArguments(args);
        // Display the Dialog
        dialogFragmentImp.show(getSupportFragmentManager(),"Display Result");
    }
}
