package com.example.pavel.wetthecat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public ImageView click_img, cat_img, dryer_img;
    public TextView condition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click_img = (ImageView)findViewById(R.id.imageView);
        cat_img = (ImageView)findViewById(R.id.imageView2);
        dryer_img = (ImageView)findViewById(R.id.imageView3);
        condition = (TextView)findViewById(R.id.textView);

        click_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bucket bucket = new Bucket();
                Cat cat = new Cat();
                Hairdryer hairdryer = new Hairdryer();

                bucket.wetTheCat(cat);
                getCondition(cat);

            }
        });

        dryer_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bucket bucket = new Bucket();
                Cat cat = new Cat();
                Hairdryer hairdryer = new Hairdryer();

                hairdryer.dryTheCat(cat);
                getCondition(cat);
            }
        });
    }
    public void getCondition(Cat cat){
        if (cat.getCatCondition(cat)=="wet"){
            cat_img.setImageResource(R.drawable.wet);
            condition.setText(R.string.wet);
        }else{
            cat_img.setImageResource(R.drawable.dry);
            condition.setText(R.string.dry);
        }
    }

}
