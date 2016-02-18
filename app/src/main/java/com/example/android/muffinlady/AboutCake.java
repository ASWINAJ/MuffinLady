package com.example.android.muffinlady;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AboutCake extends Activity{
    private List<Cakes> myCake = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aboutcake);
        populateobj();      //for populating the arraylist of cakes for displaying in the listview
        populatelist();     //for initializing the arrayadapter

    }




    public void populateobj(){
        myCake.add(new Cakes(R.drawable.a,100,"Chocolate Cake"));
        myCake.add(new Cakes(R.drawable.b,200,"Chocolate Cup Cake"));
        myCake.add(new Cakes(R.drawable.d,400,"Chocolate B Cake"));
        myCake.add(new Cakes(R.drawable.e, 500, "Chocolate C Cake"));
        myCake.add(new Cakes(R.drawable.f, 600, "Chocolate D Cake"));



    }

    public void populatelist()
    {
        ArrayAdapter<Cakes> adapter = new ListCakes();
        ListView listView = (ListView) findViewById(R.id.list_cakes);
        listView.setAdapter(adapter);



    }

    //class for customizing the list view

    private class ListCakes extends ArrayAdapter<Cakes>{
        public ListCakes()
        {
            super(AboutCake.this,R.layout.item_layout,myCake);

        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            View newitem=convertView;
            if(newitem==null) {
                newitem = getLayoutInflater().inflate(R.layout.item_layout, parent, false);
            }
            ImageView img = (ImageView)newitem.findViewById(R.id.cakeimage);
            TextView pr = (TextView) newitem.findViewById(R.id.price);
            TextView dec = (TextView) newitem.findViewById(R.id.desc);
            Cakes newcake = myCake.get(position);

            img.setImageResource(myCake.get(position).getIcon());

            pr.setText(String.valueOf(newcake.getPrice()));
            dec.setText(newcake.getDesc());
            Button buy = (Button) newitem.findViewById(R.id.buy_button);

            return newitem;
        }
    }




}
