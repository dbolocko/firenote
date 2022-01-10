package com.ccc.firenote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        Glide.with(this).asGif().load(R.drawable.fire65).into(imageView);
    }

    public void fire_note(View vvv)
    {
        ImageView imageView = (ImageView) findViewById(R.id.imageView2);
        imageView.setVisibility(View.VISIBLE);
        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView1.setVisibility(View.GONE);
        EditText t1 = (EditText) findViewById(R.id.editTextTextMultiLine);
        t1.setVisibility(View.GONE);
    }
}