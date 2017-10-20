package com.example.android_razrab.gifandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ImageView imageView = (ImageView) findViewById(R.id.my_image_view);


        Glide.with(this)
                .load("http://advetime.ru/uploads/2016/05/tumblr_o1qv2cefc61uagchno1_r1_5401.gif")
                .into(imageView);

    }
}
