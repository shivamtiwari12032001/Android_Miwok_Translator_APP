package com.example.mowiktranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.numbers);
        numbers.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
            Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
            startActivity(numbersIntent);
        }
        });
        TextView family = (TextView)findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        TextView color = (TextView)findViewById(R.id.colors);
        color.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });
        TextView phrase = (TextView)findViewById(R.id.phrases);
        phrase.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent phraseIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });
    }
    
}