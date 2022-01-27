package com.kampus.diagnosa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.kampus.diagnosa.R;
import com.kampus.diagnosa.activity.WalktroughActivity;
import com.kampus.diagnosa.model.WalktroughItem;

import org.w3c.dom.Text;

import java.util.List;

public class WalktroughAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    List<WalktroughItem> dataWalktrough;

    public WalktroughAdapter(Context context, List<WalktroughItem> dataWalktrough) {
        this.context = context;
        this.dataWalktrough = dataWalktrough;
    }



    @Override
    public int getCount() {
        return dataWalktrough.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.item_walktrough, null);
        TextView title = view.findViewById(R.id.text_title);
        TextView subtitle = view.findViewById(R.id.text_subtitle);
        ImageView imageslide = view.findViewById(R.id.image_slide);



        title.setText(dataWalktrough.get(position).getTitle());
        subtitle.setText(dataWalktrough.get(position).getSubtitle());
        imageslide.setImageResource(dataWalktrough.get(position).getImage());

        container.addView(view);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager =(ViewPager)container;
        View view =(View)object;
        viewPager.removeView(view);
    }
}
