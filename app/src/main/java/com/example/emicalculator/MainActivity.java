package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText i1, i2, i3;
    TextView Result;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i1 = findViewById(R.id.i1);
        i2 = findViewById(R.id.i2);
        i3 = findViewById(R.id.i3);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        Result = findViewById(R.id.Result);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float s = Float.valueOf(i1.getText().toString());
                Float p = Float.valueOf(i2.getText().toString());
                Float d = Float.valueOf(i3.getText().toString());

                p = p / (12 * 100);

                float final_p = 1.0f;

                for (int i = 0; i < d * 12; i++) {

                    final_p = final_p * (1 + p);
                }

                float f_ans = s * p * (final_p / (final_p - 1));

                Result.setText("તમારી ચૂકવવાપાત્ર રકમ = "+(f_ans+s)+"\n\n"+"તમારુ વ્યાજ = "+f_ans);

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i1.setText("");
                i2.setText("");
                i3.setText("");
                Result.setText("");
            }
        });


    }
}