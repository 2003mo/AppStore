package com.example.appstore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appstore.adapters.AppStoreAdapter;
import com.example.appstore.models.AppStoreClass;

import java.util.ArrayList;

public class RecycelerViewProject extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<AppStoreClass> appStoreClassArrayList;
    AppStoreAdapter appStoreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recyceler_view_project);

        rv = findViewById(R.id.rv);
        appStoreClassArrayList = new ArrayList<>();

        appStoreClassArrayList.add(new AppStoreClass(1, R.drawable.block_blast, "Block Blast!", "Puzzle • Casual", " 4.5", "161MB", false));
        appStoreClassArrayList.add(new AppStoreClass(2, R.drawable.facebook_icon, "Facebook", "Facebook • Social", " 4.8", "10B", false));
        appStoreClassArrayList.add(new AppStoreClass(3, R.drawable.instagram_icon, "Instagram", "Instagram • Social", " 4.8", "140MB", false));
        appStoreClassArrayList.add(new AppStoreClass(4, R.drawable.tradingview_icon, "Trading View", "TradingView Inc. • Finance", " 4.7", "95MB", false));
        appStoreClassArrayList.add(new AppStoreClass(5, R.drawable.chrome_icon, "Chrome", "Browser • Tools", " 4.8", "10B", false));
        appStoreClassArrayList.add(new AppStoreClass(6, R.drawable.metatrader5, "Meta Trader 5", "MetaQuotes Software Corp • Finance", "⭐ 4.8", "120MB", false));
        appStoreClassArrayList.add(new AppStoreClass(7, R.drawable.youtube_icon, "YouTube", "Google LLC • Video Players&Editors", "⭐ 4.6", "150MB", false));
        appStoreClassArrayList.add(new AppStoreClass(8, R.drawable.snapchat_icon, "Snapchat", "Snapchat • Photo", " 4.2", "130MB", false));
        appStoreClassArrayList.add(new AppStoreClass(9, R.drawable.telegram_icon, "Telegram", "Telegram • Social", " 4.8", "120MB", false));
        appStoreClassArrayList.add(new AppStoreClass(10, R.drawable.binance_icon, "Binance", "binance • Finance", " 4.8", "110MB", false));

        appStoreAdapter =new AppStoreAdapter(appStoreClassArrayList , RecycelerViewProject.this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(appStoreAdapter);
    }
}