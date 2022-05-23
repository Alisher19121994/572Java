package com.example.a572java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView shorts_rec;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        recyclerView = findViewById(R.id.main_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));


        shorts_rec = findViewById(R.id.main_2_recyclerView_id);
        shorts_rec.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        getAdapter(data());
        adapterFun(dataOfShorts());
    }

    private void adapterFun(ArrayList<Shorts> list) {
        Adapter_Shorts_Videos adapter_shorts_videos = new Adapter_Shorts_Videos(this, list);
        shorts_rec.setAdapter(adapter_shorts_videos);
    }

    private ArrayList<Shorts> dataOfShorts() {
        ArrayList<Shorts> list = new ArrayList<>();
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        list.add(new Shorts(R.drawable.rasm5, "Yevropadagi IT sanoati bilan tanishuv", "158K views"));
        return list;
    }

    private void getAdapter(ArrayList<Contents> list) {
        Adapter_1 adapter_1 = new Adapter_1(context, list);
        recyclerView.setAdapter(adapter_1);
    }

    private ArrayList<Contents> data() {
        ArrayList<Contents> contents = new ArrayList<>();

        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        contents.add(new Contents("Masha and The Bear"));
        return contents;
    }
}