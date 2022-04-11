package com.example.imagesdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public void switchCat(View view)
    {
        ImageView image = (ImageView) findViewById(R.id.catImage);
        image.setImageResource(R.drawable.new_tiger);
        Log.i("Info", "It worked");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}