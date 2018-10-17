package com.program.user.recyclerviewapplication.adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.program.user.recyclerviewapplication.R;
import com.program.user.recyclerviewapplication.model.Picture;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PictureAdapterRecyclerView.PictureViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource,parent,false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PictureAdapterRecyclerView.PictureViewHolder holder, int position) {
        Picture picture= pictures.get(position);
        holder.usernameCard.setText(picture.getUserName());
        Picasso.get().load(picture.getPicture()).into(holder.pictureCard);

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }


    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView pictureCard;
        private TextView usernameCard;

        public PictureViewHolder(View itemView) {
            super(itemView);
            pictureCard= (ImageView) itemView.findViewById(R.id.pictureCard);
            usernameCard= (TextView) itemView.findViewById(R.id.userNameCard);
        }
    }
}
