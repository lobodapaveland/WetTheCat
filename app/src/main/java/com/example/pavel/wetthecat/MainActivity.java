package com.example.pavel.wetthecat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public ImageView click_img, cat_img;
    public TextView condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_img = (ImageView)findViewById(R.id.imageView);
        cat_img = (ImageView)findViewById(R.id.imageView2);
        condition = (TextView)findViewById(R.id.textView);

        click_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity activity = new MainActivity();
                Bucket bucket = new Bucket();
                Cat cat = new Cat();

                bucket.wetTheCat(cat);
                cat.getCatCondition(cat, activity);
            }
        });
    }
}
