package com.example.appstore.adapters;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appstore.R;
import com.example.appstore.models.AppStoreClass;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AppStoreAdapter extends RecyclerView.Adapter<AppStoreAdapter.ViewHolderClass> {
    ArrayList<AppStoreClass> arrayList;
    Activity activity;

    public AppStoreAdapter(ArrayList<AppStoreClass> arrayList, Activity activity) {
        this.arrayList = arrayList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public AppStoreAdapter.ViewHolderClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ViewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.appstoreitem , parent ,false);
        return new ViewHolderClass(ViewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull AppStoreAdapter.ViewHolderClass holder, int position) {
        holder.tv_rank.setText(String.valueOf(position + 1));
        holder.iv_app_icon.setImageResource(arrayList.get(position).getImage());
        holder.tv_app_name.setText(arrayList.get(position).getName());
        holder.tv_category.setText(arrayList.get(position).getCategory());
        holder.tv_rate.setText(arrayList.get(position).getRate());
        holder.tv_size.setText(arrayList.get(position).getSize());
        holder.constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity , activity.getClass());
                activity.startActivity(i);

            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderClass extends RecyclerView.ViewHolder {
        public CircleImageView iv_app_icon;
        public TextView tv_rank , tv_app_name , tv_category , tv_rate , tv_star , tv_size;
        public ConstraintLayout constraintLayout;
        public ViewHolderClass(@NonNull View itemView) {
            super(itemView);
            iv_app_icon = itemView.findViewById(R.id.iv_app_icon);
            tv_rank = itemView.findViewById(R.id.tv_rank);
            tv_app_name = itemView.findViewById(R.id.tv_app_name);
            tv_category = itemView.findViewById(R.id.tv_category);
            tv_rate = itemView.findViewById(R.id.tv_rate);
            tv_size = itemView.findViewById(R.id.tv_size);
            tv_star = itemView.findViewById(R.id.tv_star);
            constraintLayout = itemView.findViewById(R.id.layout_appstoreitem);

        }
    }
}
