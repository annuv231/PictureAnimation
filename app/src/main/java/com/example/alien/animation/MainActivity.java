package com.example.alien.animation;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
          public void fade1(View view){
              //erlich
              ImageView image1=(ImageView)findViewById(R.id.bean);
              ImageView image2=(ImageView)findViewById(R.id.erlich);
              ImageView image3=(ImageView)findViewById(R.id.gilfoyle);
              ImageView image4=(ImageView)findViewById(R.id.jessica);
              image1.animate().alpha(0f).setDuration(2000);
              image3.animate().alpha(0f).setDuration(2000);
              image4.animate().alpha(0f).setDuration(2000);
              image2.animate().alpha(1f).setDuration(2000);
            //  image1.animate().alpha(1f).setDuration(2000);
              Log.i("hey","1 button clicked first");
          }
          public void fade2(View view){
              //bean
              ImageView image1=(ImageView)findViewById(R.id.bean);
              ImageView image2=(ImageView)findViewById(R.id.erlich);
              ImageView image3=(ImageView)findViewById(R.id.gilfoyle);
              ImageView image4=(ImageView)findViewById(R.id.jessica);
              image2.animate().alpha(0f).setDuration(2000);
              image3.animate().alpha(0f).setDuration(2000);
              image4.animate().alpha(0f).setDuration(2000);
              image1.animate().alpha(1f).setDuration(2000);
              //  image1.animate().alpha(1f).setDuration(2000);
              Log.i("hey","2 button clicked first");
          }
    public void fade3(View view){
              //jessica
        ImageView image1=(ImageView)findViewById(R.id.bean);
        ImageView image2=(ImageView)findViewById(R.id.erlich);
        ImageView image3=(ImageView)findViewById(R.id.gilfoyle);
        ImageView image4=(ImageView)findViewById(R.id.jessica);
        image1.animate().alpha(0f).setDuration(2000);
        image3.animate().alpha(0f).setDuration(2000);
        image2.animate().alpha(0f).setDuration(2000);
        image4.animate().alpha(1f).setDuration(2000);
        //  image1.animate().alpha(1f).setDuration(2000);
        Log.i("hey","3 button clicked first");
    }
    public void fade4(View view){
              //gilfoyle
        ImageView image1=(ImageView)findViewById(R.id.bean);
        ImageView image2=(ImageView)findViewById(R.id.erlich);
        ImageView image3=(ImageView)findViewById(R.id.gilfoyle);
        ImageView image4=(ImageView)findViewById(R.id.jessica);
        image1.animate().alpha(0f).setDuration(2000);
        image2.animate().alpha(0f).setDuration(2000);
        image4.animate().alpha(0f).setDuration(2000);
        image3.animate().alpha(1f).setDuration(2000);
        //  image1.animate().alpha(1f).setDuration(2000);
        Log.i("hey","4thbutton clicked");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
