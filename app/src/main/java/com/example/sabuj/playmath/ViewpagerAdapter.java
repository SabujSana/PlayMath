package com.example.sabuj.playmath;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.Objects;

/**
 * Created by SABUJ on 21/10/2016.
 */
public class ViewpagerAdapter extends PagerAdapter{
    private  int[] imageResources ={R.drawable.akcoin,R.drawable.duicoin,R.drawable.pascoin,R.drawable.aktaka,
            R.drawable.duitaka,R.drawable.pastaka,R.drawable.dostaka,R.drawable.bistaka,R.drawable.pocastaka};
    private Context context;
    private LayoutInflater layoutInflater;

public  ViewpagerAdapter(Context context){
    this.context = context;
}

    @Override
    public int getCount() {
        return imageResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container ,int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.layout_viewpager, container,false);
        ImageView imageView = (ImageView)item_view.findViewById(R.id.iv_images);
        imageView.setImageResource(imageResources[position]);
        container.addView(item_view);
        return  item_view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
     container.removeView((LinearLayout) object);
    }
}
