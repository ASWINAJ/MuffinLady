package com.example.android.muffinlady;

import android.app.Activity;
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

public class begin extends Activity{
    private List<Cakes> myCake = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_beg);
        populateobj();
        populatelist();
        listener();
    }

    public void listener()
    {
        final ListView listView = (ListView)findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View viewclicked, int position, long id) {
                Cakes finals = myCake.get(position);
                String msg= finals.getDesc();
                Toast n = Toast.makeText(begin.this,msg,Toast.LENGTH_SHORT);
                n.show();
            }
        });


    }


    public void populateobj(){
        myCake.add(new Cakes(R.drawable.a,100,"Chocolate Cake"));
        myCake.add(new Cakes(R.drawable.b,200,"Chocolate Cup Cake"));
        myCake.add(new Cakes(R.drawable.d,400,"Chocolate B Cake"));
        myCake.add(new Cakes(R.drawable.e, 500, "Chocolate C Cake"));
        myCake.add(new Cakes(R.drawable.f, 600, "Chocolate D Cake"));
        myCake.add(new Cakes(R.drawable.e, 500, "Chocolate C Cake"));
        myCake.add(new Cakes(R.drawable.e, 500, "Chocolate C Cake"));
        myCake.add(new Cakes(R.drawable.e, 500, "Chocolate C Cake"));

    }

    public void populatelist()
    {
        ArrayAdapter<Cakes> adapter = new ListCakes();
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);



    }

    private class ListCakes extends ArrayAdapter<Cakes>{
        public ListCakes()
        {
            super(begin.this,R.layout.layout,myCake);

        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View newitem=convertView;
            if(newitem==null) {
                newitem = getLayoutInflater().inflate(R.layout.layout, parent, false);
            }
            ImageView img = (ImageView)newitem.findViewById(R.id.imageView);
            TextView pr = (TextView) newitem.findViewById(R.id.price);
            TextView dec = (TextView) newitem.findViewById(R.id.desc);
            Cakes newcake = myCake.get(position);


            // Toast a = Toast.makeText(MainActivity.this,"what is this",Toast.LENGTH_SHORT);
            // a.show();

            img.setImageResource(myCake.get(position).getIcon());

            pr.setText(String.valueOf(newcake.getPrice()));
            dec.setText(newcake.getDesc());
            Button buy = (Button) newitem.findViewById(R.id.but1);

            buy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    myCake.remove(position);
                    notifyDataSetChanged();

                }
            });
            return newitem;
        }
    }




}
