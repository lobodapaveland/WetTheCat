package com.example.pavel.wetthecat;

public class Cat {
    public String catCondition = "dry";

    public void getCatCondition(Cat cat, MainActivity activity){
        if (cat.catCondition == "dry"){
            activity.condition.setText(R.string.dry);
            activity.cat_img.setImageResource(R.drawable.dry);
        }else{
            activity.condition.setText(R.string.wet);
            activity.cat_img.setImageResource(R.drawable.wet);
        }
    }
}
