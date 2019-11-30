package com.example.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private List<Hotel> hotelList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         inithotels();
         ListView listView=findViewById(R.id.list_view);
         HotelAdapter adapter=new HotelAdapter(MainActivity.this,R.layout.hotel_item, hotelList);
         listView.setAdapter(adapter);
         listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Hotel hotel=hotelList.get(position);
               Toast.makeText(MainActivity.this,hotel.getName(),Toast.LENGTH_SHORT).show();
             }
         });
    }
    private void inithotels(){
        for(int i=0;i<15;i++){
            Hotel hotel1=new Hotel("衡山酒店",R.drawable.hotel,500);
            hotelList.add(hotel1);
            Hotel hotel2=new Hotel("泰山酒店",R.drawable.hotel2,5100);
            hotelList.add(hotel2);
            Hotel hotel3=new Hotel("华山酒店",R.drawable.hotel4,500);
            hotelList.add(hotel3);
        }
    }
}
