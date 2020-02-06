package com.swaliya.hellowcashback.adapter;

/**
 * Created by Diu on 10/20/2016.
 */

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.ImageLoader;
import com.swaliya.hellowcashback.R;
import com.swaliya.hellowcashback.activity.DthRechargeActivity;
import com.swaliya.hellowcashback.model.dth.DthPlanList;
import com.swaliya.hellowcashback.model.hotel.AvailableHotel;

import java.util.List;


public class DthPlanAdapter extends RecyclerView.Adapter<DthPlanAdapter.ViewHolder> {

    private ImageLoader imageLoader;
    private Context context;
    private int lastPosition = -1;

    private List<DthPlanList> superHeroes;
    String getid;

    public DthPlanAdapter(List<DthPlanList> superHeroes, Context context) {
        super();

        this.superHeroes = superHeroes;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_dthplan_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        // setFadeAnimation(holder.itemView);
        // setAnimationn(holder.itemView, position);

        final DthPlanList m = superHeroes.get(position);

        holder.tvAmount.setText("\u20B9  " + m.getAmount());
        holder.tvDetails.setText("Details:- " + m.getDetail());
        holder.tvValidity.setText("Validity:- " + m.getValidity());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             /*   Intent intent = new Intent(context, DthRechargeActivity.class);
                intent.putExtra("Amount", m.getAmount());
                intent.putExtra("Details", m.getDetail());
                intent.putExtra("Validity", m.getValidity());
                System.out.println(m.getAmount());
                intent.setFlags(Intent.FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY);
                context.startActivity(intent);*/

                DthRechargeActivity.linearLayout.setVisibility(View.VISIBLE);
                DthRechargeActivity.edAmount.setText(m.getAmount());
                DthRechargeActivity.tvValidity.setText(m.getValidity());
                DthRechargeActivity.tvDetails.setText(m.getDetail());
                ((Activity) context).finish();
                ((Activity) context).overridePendingTransition(R.anim.slide_up, R.anim.slide_down);
            }
        });

    }

    private void setAnimationn(View viewToAnimate, int position) {

        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            animation.setDuration(1000);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        } else if (position < lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    public void setFadeAnimation(View view) {
        AlphaAnimation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(2000);
        view.startAnimation(anim);
    }

    private void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.bounce_interpolator);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }


    @Override
    public int getItemCount() {
        return superHeroes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvAmount, tvDetails, tvValidity;


        public ViewHolder(View itemView) {
            super(itemView);
            tvAmount = (TextView) itemView.findViewById(R.id.tvAmount);
            tvValidity = (TextView) itemView.findViewById(R.id.tvValidity);
            tvDetails = (TextView) itemView.findViewById(R.id.tvDetails);
        }

    }
}
