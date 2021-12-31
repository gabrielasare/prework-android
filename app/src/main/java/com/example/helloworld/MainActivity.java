package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textview =  ((TextView) findViewById(R.id.text));


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Change text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));

            }
        });

        findViewById(R.id.changeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_green));
            }
        });

        findViewById(R.id.changeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview.setText("Android is Awesome!");
            }
        });

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Reset text to "Hello from Gabriel!
                ((TextView) findViewById(R.id.text)).setText("Hello from Gabriel!");

                // Reset the color of the text to the original color
                textview.setTextColor(getResources().getColor(R.color.black));

                // Reset the whole background color
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.light_purple));
            }
        });

        findViewById(R.id.changeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change text view to presonal text
                String userEnterredText = ((EditText) findViewById(R.id.editText)).getText().toString();

                // if text field is empty, update it with original text!
                if (userEnterredText.isEmpty()){
                    textview.setText("Enter your own text");
                } else{
                    textview.setText(userEnterredText);
                }
            }
        });
    }
}