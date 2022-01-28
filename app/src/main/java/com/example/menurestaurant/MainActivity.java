package com.example.menurestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkpizza, chkaHamb, boissonG;
    Button ButtonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkpizza = (CheckBox) findViewById(R.id.chckBoxP);
        chkaHamb = (CheckBox) findViewById(R.id.chckBoxH);
        boissonG = (CheckBox) findViewById(R.id.chckBoxB);
        ButtonOrder = (Button) findViewById(R.id.btAddition);

        ButtonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalAddion = 0;
                StringBuilder result = new StringBuilder();
                result.append("Articles choisie");
                if (chkpizza.isChecked()) {
                    result.append("\nPizza 9000 DT");
                    totalAddion += 9000;
                }
                if (chkaHamb.isChecked()) {

                    result.append("\n hamburger 6000 DT");
                    totalAddion += 6000;
                }
                if (boissonG.isChecked()) {

                    result.append("\n boisson gazeuse 2000DT");
                    totalAddion += 2000;
                }
                result.append("\n Total: " + totalAddion + " DT ");
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();


            }
        });

    }
}