package com.example.hw_2322_n_terms_of_even_number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText firstInput;
    Button button;
    TextView tvDisplay, tvDisplaySum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput = findViewById(R.id.firstInput);
        button = findViewById(R.id.button);
        tvDisplay= findViewById(R.id.tvDisplay);
        tvDisplaySum= findViewById(R.id.tvDisplaySum);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay.setText("");
                tvDisplaySum.setText("");
                int sum=0;

                int userInput = Integer.parseInt(firstInput.getText().toString());

                for (int i = 1; i <= userInput*2 ; i++) {

                    if (i%2==0){

                        tvDisplay.append(" "+i);
                        sum = sum+i;
                        tvDisplaySum.setText("Total sum of all even Number is: "+""+sum);
                    }

                }


            }
        });


    }
}