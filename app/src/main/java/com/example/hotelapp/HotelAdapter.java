package com.example.hotelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HotelAdapter extends ArrayAdapter<Hotel> {
    private int resourceId;
    public HotelAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Hotel hotel=getItem(position);
        View view;
       ViewHolder viewHolder;
        if(convertView==null){ view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
          viewHolder=new ViewHolder();
          viewHolder.hotelimage=view.findViewById(R.id.image_view);
          viewHolder.hotelname=view.findViewById(R.id.text_view1);
          viewHolder.hotelprice=view.findViewById(R.id.text_view2);
           view.setTag(viewHolder);
        }else{
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }
        viewHolder.hotelimage.setImageResource(hotel.getImageId());
        viewHolder.hotelname.setText(hotel.getName());
        viewHolder.hotelprice.setText(hotel.getPrice()+"");
        return view;
    }
    static class ViewHolder{
        ImageView hotelimage;
        TextView hotelname;
        TextView hotelprice;
    }
}
