package com.swaliya.hellowcashback.adapter;

/**
 * Created by Diu on 10/20/2016.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.ImageLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.model.RequestPojo;

import java.util.List;


public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private ImageLoader imageLoader;
    private Context context;
    private int lastPosition = -1;

    private List<RequestPojo> superHeroes;
    String getid;

    public TestAdapter(List<RequestPojo> superHeroes, Context context) {
        super();

        this.superHeroes = superHeroes;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.test_item_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

       /* Animation animation = AnimationUtils.loadAnimation(context, (viewType > lastPosition) ? R.anim.slide_up : R.anim.slide_down);
        parent.startAnimation(animation);
        lastPosition = viewType;*/

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        final RequestPojo m = superHeroes.get(position);
        holder.textViewId.setText("Time : " + m.getBanerTitle());
        Glide.with(context).load(m.getBanerImage())
                .thumbnail(0.5f)
                .crossFade()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(holder.imageView);
        // setAnimation(holder.itemView, position);
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }



    @Override
    public int getItemCount() {
        return superHeroes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textViewId;


        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img);
            textViewId = (TextView) itemView.findViewById(R.id.tv);

        }
    }


}
