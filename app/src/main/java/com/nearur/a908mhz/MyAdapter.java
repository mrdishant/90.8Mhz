package com.nearur.a908mhz;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mrdis on 8/27/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

ArrayList<Programs> programs;


    public MyAdapter(ArrayList<Programs> programs) {
        this.programs = programs;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        CheckedTextView checkedTextView;
        TextView textView;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);

             checkedTextView=(CheckedTextView)itemView.findViewById(R.id.checkedTextViewname);
             textView=(TextView)itemView.findViewById(R.id.textViewtime);
             imageView=(ImageView)itemView.findViewById(R.id.imageViewprograms);

        }
    }


    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.programs,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        Programs program=programs.get(position);

        holder.checkedTextView.setText(program.name);
        holder.textView.setText(program.time);
        holder.imageView.setBackgroundResource(program.icon);

    }

    @Override
    public int getItemCount() {
        return programs.size();
    }
}
