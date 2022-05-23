package com.example.a572java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter_Shorts_Videos extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Shorts> list;

    public Adapter_Shorts_Videos(Context context, ArrayList<Shorts> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shorts_videos, parent, false);
        return new Shorts_Videos_ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Shorts shorts = list.get(position);
        if (holder instanceof Shorts_Videos_ViewHolder) {
            ((Shorts_Videos_ViewHolder) holder).imageView.setImageResource(shorts.image);
            ((Shorts_Videos_ViewHolder) holder).textView1.setText(shorts.title);
            ((Shorts_Videos_ViewHolder) holder).textView2.setText(shorts.views);
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Shorts_Videos_ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public Shorts_Videos_ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.shorts_videos_image_id);
            textView1 = itemView.findViewById(R.id.shorts_text_1_id);
            textView2 = itemView.findViewById(R.id.shorts_text_2_id);
        }
    }
}
