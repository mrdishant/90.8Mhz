package com.nearur.a908mhz;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mrdis on 8/27/2017.
 */

public class Myadapte extends ArrayAdapter<Programs> {

    Context context;  int resource;  List<Programs> objects;
    public Myadapte(Context context,  int resource,  List<Programs> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view= LayoutInflater.from(context).inflate(resource,parent,false);

        CheckedTextView checkedTextView=(CheckedTextView)view.findViewById(R.id.checkedTextViewname);
        TextView textView=(TextView)view.findViewById(R.id.textViewtime);
        ImageView imageView=(ImageView)view.findViewById(R.id.imageViewprograms);

        Programs programs=objects.get(position);

        checkedTextView.setText(programs.name);
        textView.setText(programs.time);
        imageView.setBackgroundResource(programs.icon);
        return view;
    }
}
