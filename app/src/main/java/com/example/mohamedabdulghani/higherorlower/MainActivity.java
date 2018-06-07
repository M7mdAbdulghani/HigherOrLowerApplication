package com.example.mohamedabdulghani.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int randomNumber;
    Random rand;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand = new Random();
        randomNumber = rand.nextInt(20) + 1;

    }

    public void GuessFunction(View view){


        EditText guessEditText = findViewById(R.id.guessEditText);
        if(randomNumber == Integer.parseInt(guessEditText.getText().toString())){
            DisplayMessage("That's right! Try again");
            randomNumber = rand.nextInt(20) + 1;
        }
        else if(randomNumber > Integer.parseInt(guessEditText.getText().toString())){
            DisplayMessage("Lower");
        }
        else{
            DisplayMessage("Higher");
        }
    }

    public void DisplayMessage(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
