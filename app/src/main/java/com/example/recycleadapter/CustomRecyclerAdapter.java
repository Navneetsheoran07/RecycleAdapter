    package com.example.recycleadapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder> {
    ArrayList<RecylerModel> userlist;
    Context context;
    public CustomRecyclerAdapter(ArrayList<RecylerModel> userlist, Context context) {
        this.userlist = userlist;
        this.context =  context;
    }


    @NonNull
    @Override
    public CustomRecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(R.layout.recylerformet,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(view);

        return  myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerAdapter.MyViewHolder holder, int position) {
  RecylerModel recylerModel = userlist.get(position);
   holder.imageView.setImageResource(recylerModel.getImageurl());
   holder.textView.setText(recylerModel.getName());
   holder.clickbgtn.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Random random= new Random();
           int color = Color.argb(255,random.nextInt(255),random.nextInt(255),random.nextInt(255));
           int color1 = Color.argb(255,random.nextInt(255),random.nextInt(255),random.nextInt(255));
           holder.relativeLayout.setBackgroundColor(color);
           holder.textView.setTextColor(color1);
       }
   });
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        EditText editText;
        TextView textView;
        Button  clickbgtn;
        RelativeLayout relativeLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageview);
            editText = itemView.findViewById(R.id.edittext);
            textView = itemView.findViewById(R.id.textview);
            clickbgtn = itemView.findViewById(R.id.clickbtn);
            relativeLayout = itemView.findViewById(R.id.RelativeLayout);
        }
    }
}
