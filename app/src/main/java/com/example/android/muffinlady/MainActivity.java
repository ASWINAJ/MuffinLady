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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Setting the layout to be activity_main xml file


    }

  public void onclicked(View view)      //function invoked on pressing the login button
  {

      EditText uname = (EditText) findViewById(R.id.uname_text_view);   //editview corresponding to the username
      EditText pass = (EditText) findViewById(R.id.passw_text_view);    //editview corresponding to the password

      if((pass.getText().toString().equals("root")) && (uname.getText().toString().equals("root"))) //checking for authentication
      {
          Intent i = new Intent(MainActivity.this,Products.class);   //starting the new activity Products
          startActivity(i);
      }
      else
      {
          uname.setError("Wrong username");         //if not root autherization it will pop up an error
          pass.setError("Wrong password");
      }
  }


}
