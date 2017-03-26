package com.example.nick.firstapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nick.firstapp.R;
import com.example.nick.firstapp.model.Landscape;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by Nick on 3/26/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<Landscape> mData;
    private LayoutInflater mInflater;

    public RecyclerAdapter(List<Landscape> mData, Context context) {
        this.mData = mData;
        this.mInflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder");
        View view = mInflater.inflate(R.layout.list_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder " + position);

        Landscape currentObj = mData.get(position);
        holder.setData(currentObj, position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        ImageView imgThumb, imgDelete, imgAdd;
        int position;
        Landscape current;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            imgThumb = (ImageView) itemView.findViewById(R.id.imageView);
            imgAdd = (ImageView) itemView.findViewById(R.id.img_row_add);
            imgDelete = (ImageView) itemView.findViewById(R.id.img_row_delete);
        }

        public void setData(Landscape currentObj, int position) {
            this.title.setText(currentObj.getTitle());
            this.imgThumb.setImageResource(currentObj.getImageId());
            this.position = position;
            this.current = currentObj;
        }
    }
}
