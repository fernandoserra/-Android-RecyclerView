package com.program.user.recyclerviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.program.user.recyclerviewapplication.adapter.PictureAdapterRecyclerView;
import com.program.user.recyclerviewapplication.model.Picture;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView picturesRecycler = (RecyclerView) findViewById(R.id.pictureRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buidPictures(),R.layout.cardview_picture,this);
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

    }


    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://cdn.pixabay.com/photo/2016/03/09/09/17/computer-1245714_960_720.jpg","Computer"));
        pictures.add(new Picture("https://cdn.pixabay.com/photo/2016/04/20/08/21/entrepreneur-1340649__340.jpg","finance"));
        pictures.add(new Picture("https://cdn.pixabay.com/photo/2017/03/07/20/53/cog-wheels-2125183_960_720.jpg","Mecanismo"));
        pictures.add(new Picture("https://cdn.pixabay.com/photo/2013/01/17/05/58/chicago-75152_960_720.jpg","Chicago"));
        pictures.add(new Picture("https://pbs.twimg.com/media/CxPu9sXXEAA1FC3.jpg","Steve"));
        pictures.add(new Picture("https://pbs.twimg.com/media/CxovPj6XUAAd67M.jpg","Albert"));
        pictures.add(new Picture("https://pbs.twimg.com/media/C0CsEBiXgAE4Gba.jpg","Desarrollo Web"));
        pictures.add(new Picture("https://pbs.twimg.com/media/DOogJh9WsAI2MEZ.jpg","CryptpCompare"));
        pictures.add(new Picture("https://pbs.twimg.com/media/Dez-Y4tXcAAp53q.jpg","Programer"));
        pictures.add(new Picture("https://pbs.twimg.com/profile_images/776791781870596096/gpRPRPBz_400x400.jpg","Fernando Serra"));
        return pictures;
    }

}
