package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem tabItem1,tabItem2,tabItem3;
    ViewPager viewPager;
PagerAdapter pagerAdapter;
private Button playmusicbtn;





  @  Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout1);
        tabItem1=(TabItem)findViewById(R.id.tab1);
        tabItem2=(TabItem)findViewById(R.id.tab2);
        tabItem3=(TabItem)findViewById(R.id.tab3);
        viewPager=(ViewPager)findViewById(R.id.Vpager);
        pagerAdapter=new pageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
      playmusicbtn=findViewById(R.id.play_music);
      playmusicbtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            openPlaying();
          }
      });


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
            if(tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2){
             pagerAdapter.notifyDataSetChanged();}
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnAdapterChangeListener((ViewPager.OnAdapterChangeListener) new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        // listen for Scroll or page change
}

    private void openPlaying() {
      Intent intent=new Intent(this,Playing.class);
      startActivity(intent);
    }
}