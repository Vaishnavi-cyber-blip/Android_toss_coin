package com.example.tosss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView imageView = (ImageView) findViewById(R.id.image_2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)

        {
            int res_image = bundle.getInt("coin");

            imageView.setImageResource(res_image);
        }
    }
}