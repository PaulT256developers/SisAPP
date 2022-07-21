package com.example.mysis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterGridView extends BaseAdapter {
    Context context;
    ArrayList<GridViewPojo> gridViewPojos;

    public AdapterGridView (Context context,ArrayList<GridViewPojo> gridViewPojos){
        this.context = context;
        this.gridViewPojos = gridViewPojos;
    }

    @Override
    public int getCount() {
        return gridViewPojos.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.custom_grid, parent, false);
        ImageView imageView = convertView.findViewById(R.id.icon);
        //ImageView imageView1 = convertView.findViewById(R.id.icon1);
        TextView title = convertView.findViewById(R.id.title);

        imageView.setImageResource(gridViewPojos.get(position).getImages());
        title.setText(gridViewPojos.get(position).getTitle());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Name: " + gridViewPojos.get(position).getTitle(), Toast.LENGTH_SHORT).show();



            }
        });

        return convertView;
    }
}
