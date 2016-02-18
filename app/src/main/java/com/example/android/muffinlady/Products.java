package com.example.android.muffinlady;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Products extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);
    }

    //function to be invoked on clicking the button
    public void onclick(View view) {
        if (view.getId() == R.id.item1_text_view) {
            Toast a = Toast.makeText(Products.this, "U can now have the collection of cakes", Toast.LENGTH_SHORT);
            a.show();
            Intent i = new Intent(Products.this, AboutCake.class);  //invoking the new activity AboutCake
            startActivity(i);
        }
        else{
            Toast a = Toast.makeText(Products.this, "Sorry..not yet added..", Toast.LENGTH_SHORT);
            a.show();

        }

    }


}
