package com.example.vjm;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class SliderAdapter extends PagerAdapter {

    List<SliderItem> sliderItems;
    Context context;
    ViewPager viewPager;

    public SliderAdapter(List<SliderItem> sliderItems, Context context,ViewPager viewPager) {
        this.sliderItems = sliderItems;
        this.context = context;
        this.viewPager = viewPager;
    }

    @Override
    public int getCount() {
        return sliderItems.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view = LayoutInflater.from(context).inflate(R.layout.slider_item_container,container,false);

        ImageView imageView;
        imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(sliderItems.get(position).getImage());
        container.addView(view,0);
        if(position == sliderItems.size() - 2)
        {
            viewPager.post(runnable);
        }

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }


    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            sliderItems.addAll(sliderItems);
            notifyDataSetChanged();
        }
    };
}


