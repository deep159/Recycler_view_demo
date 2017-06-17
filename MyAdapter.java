package com.jaspal.recyclerviewandroid;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by sunil on 4/4/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    Context mContext;
    ArrayList<String> mName;
    ArrayList<Integer> mOPictures;
    LayoutInflater inflater;

    public MyAdapter(MainActivity mainActivity, ArrayList<String> mNameArrayList, ArrayList<Integer> mPitureArrayList) {

        mContext = mainActivity;
        mName=mNameArrayList;
        mOPictures=mPitureArrayList;
        inflater=inflater.from(mContext);
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.row_design,parent,false);
        MyHolder holder=new MyHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.mTextView.setText(mName.get(position));
        holder.mImageView.setImageResource(mOPictures.get(position));

        animateView(holder.itemView,position);

    }

    public void animateView(View view,int poistion)
    {
        int last=0;
        if(poistion>last)
        {
            Animation animation=AnimationUtils.loadAnimation(mContext,android.R.anim.slide_in_left);
            view.setAnimation(animation);
            last=poistion;
        }
    }


    @Override
    public int getItemCount() {
        return mName.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView mImageView;
        TextView mTextView;
        public MyHolder(View view) {
            super(view);
            mImageView= (ImageView) view.findViewById(R.id.profile_image);
            mTextView= (TextView) view.findViewById(R.id.profile_name);
            view.setOnClickListener(this);

        }
        @Override
        public void onClick(View view) {
            int position=getAdapterPosition();
            Toast.makeText(mContext,mName.get(position), Toast.LENGTH_SHORT).show();
        }
    }

}
