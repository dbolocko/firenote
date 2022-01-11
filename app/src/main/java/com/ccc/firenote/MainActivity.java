package com.ccc.firenote;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends Activity {
    ImageView imageView;
    ImageView imageView1;
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView2);
        imageView1 = (ImageView) findViewById(R.id.imageView);
        t1 = (EditText) findViewById(R.id.editTextTextMultiLine);
        t1.setBackgroundResource(R.drawable.border);
        Glide.with(this).asGif().load(R.drawable.fire65).into(imageView);
    }

    public void fire_note(View vvv)
    {
        imageView.setVisibility(View.VISIBLE);
        imageView1.setVisibility(View.GONE);

        t1.setVisibility(View.GONE);
    }
}