package com.ricardoteixeira.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View Variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The button was clicked, so update the fact label with a new fact
                String fact = "";
                // Randomly select a fact
                Random randomGenerator = new Random(); // Construct new Random number generator
                int randomNumber = randomGenerator.nextInt(3);
                fact = randomNumber + "";

                // Update the label with our dynamic fact
                factLabel.setText(fact);
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
