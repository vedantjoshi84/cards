package com.e.cards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.style.TtsSpan;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {

    private TabLayout tablayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

//    TextView houseDescription;
//    ImageView houseImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        houseDescription = (TextView)findViewById(R.id.txtDescription);
//        houseImage = (ImageView)findViewById(R.id.ivImage1);
//
//        Bundle mBundle = getIntent().getExtras();
//
//        if(mBundle!=null)
//        {
//            houseDescription.setText(mBundle.getString("Description"));
//            houseImage.setImageResource(mBundle.getInt("Image"));
//        }

        tablayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding Fragments
        adapter.AddFragment(new FragmentFlat(),"Flat");
        adapter.AddFragment(new FragmentFlat(),"Rent");
        adapter.AddFragment(new FragmentFlat(),"Address");

        //adapter Setup
        viewPager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewPager);


    }
}
