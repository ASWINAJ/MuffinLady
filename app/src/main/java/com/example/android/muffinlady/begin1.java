package com.example.android.muffinlady;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class begin1 extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        // Intent i = new Intent(MainActivity.this,begin.class);
        // startActivity(i);

    }

    public void onclick(View view) {
        if (view.getId() == R.id.open1_text_view) {
            Toast a = Toast.makeText(begin1.this, "U can now have the collection of cakes", Toast.LENGTH_SHORT);
            a.show();
            Intent i = new Intent(begin1.this, begin.class);
            startActivity(i);
        }
        else{
            Toast a = Toast.makeText(begin1.this, "Sorry..not yet added..", Toast.LENGTH_SHORT);
            a.show();

        }

    }


}
