package com.example.vjm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.transition.Slide;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//hello

    ViewPager viewPager;
    Handler sliderHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);


        final List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.backdes));
        sliderItems.add(new SliderItem(R.drawable.backdes));
        sliderItems.add(new SliderItem(R.drawable.first));
        sliderItems.add(new SliderItem(R.drawable.second));
        sliderItems.add(new SliderItem(R.drawable.third));
        sliderItems.add(new SliderItem(R.drawable.fourth));

        SliderAdapter adapter = new SliderAdapter(sliderItems,getApplicationContext(),viewPager);
        viewPager.setAdapter(adapter);
        sliderHandler.removeCallbacks(sliderRunnable);
        sliderHandler.postDelayed(sliderRunnable,3000);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                sliderHandler.removeCallbacks(sliderRunnable);
                sliderHandler.postDelayed(sliderRunnable,3000);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    Runnable sliderRunnable = new Runnable() {
        @Override
        public void run() {
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    };

}
