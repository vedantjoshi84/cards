package com.e.cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<HouseRent> myHouseList;
    HouseRent mHouseRent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myHouseList = new ArrayList<>();

        mHouseRent = new HouseRent("One BHK and Swimming pool"," During that time they have been good tenants in that they always kept their apartment neat and clean, were considerate of her neighbors and paid their rent on time. We anticipate full refund of their security deposit.","30000",R.drawable.house4);
        myHouseList.add(mHouseRent);

        mHouseRent = new HouseRent("Two BHK and Swimming pool"," During that time they have been good tenants in that they always kept their apartment neat and clean, were considerate of her neighbors and paid their rent on time. We anticipate full refund of their security deposit.","40000",R.drawable.house3);
        myHouseList.add(mHouseRent);

        mHouseRent = new HouseRent("Three BHK and Swimming pool"," During that time they have been good tenants in that they always kept their apartment neat and clean, were considerate of her neighbors and paid their rent on time. We anticipate full refund of their security deposit.","50000",R.drawable.house2);
        myHouseList.add(mHouseRent);

        mHouseRent = new HouseRent("Four BHK and Swimming pool"," During that time they have been good tenants in that they always kept their apartment neat and clean, were considerate of her neighbors and paid their rent on time. We anticipate full refund of their security deposit.","60000",R.drawable.house1);
        myHouseList.add(mHouseRent);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,myHouseList);
        mRecyclerView.setAdapter(myAdapter);

    }
}
