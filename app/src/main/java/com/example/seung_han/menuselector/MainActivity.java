package com.example.seung_han.menuselector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button, button3;
    TextView textView;
    ImageView wheel;

    Random random;
    String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12;
    int degree1 =  0;
    int degree2 = 0;

    private static final float factor = 16.3636f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         button = findViewById(R.id.button);
         button3  =  findViewById(R.id.button3);
         textView = findViewById(R.id.textView);
         wheel = findViewById(R.id.wheel);
         random =  new Random();

         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 degree2 = degree1 % 360;
                 degree1 = random.nextInt((3600) + 720);
                 RotateAnimation rotate = new RotateAnimation(degree2, degree1,
                         RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                         RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                 rotate.setDuration(3600);
                 rotate.setFillAfter(true);
                 rotate.setInterpolator(new DecelerateInterpolator());
                 rotate.setAnimationListener(new Animation.AnimationListener() {
                     @Override
                     public void onAnimationStart(Animation animation) {
                        textView.setText("");
                     }

                     @Override
                     public void onAnimationEnd(Animation animation) {
                        textView.setText(currentNumber(360 - (degree1 % 360)));
                     }

                     @Override
                     public void onAnimationRepeat(Animation animation) {

                     }
                 });
                 wheel.startAnimation(rotate);
             }
         });
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openActivityTwo();
             }
         });
    }
    private String currentNumber(int degrees) {
        s1 = getIntent().getStringExtra("i1");
        s2 = getIntent().getStringExtra("i2");
        s3 = getIntent().getStringExtra("i3");
        s4 = getIntent().getStringExtra("i4");
        s5 = getIntent().getStringExtra("i5");
        s6 = getIntent().getStringExtra("i6");
        s7 = getIntent().getStringExtra("i7");
        s8 = getIntent().getStringExtra("i8");
        s9 = getIntent().getStringExtra("i9");
        s10 = getIntent().getStringExtra("i10");
        s11 = getIntent().getStringExtra("i11");
        s12 = getIntent().getStringExtra("i12");
        String text = " ";
        if  (degrees >= (factor * 1) && degrees < (factor * 3))
            text = s1;
        if  (degrees >= (factor * 3) && degrees < (factor * 5))
            text = s2;
        if  (degrees >= (factor * 5) && degrees < (factor * 7))
            text = s3;
        if  (degrees >= (factor * 7) && degrees < (factor * 9))
            text = s4;
        if  (degrees >= (factor * 9) && degrees < (factor * 11))
            text = s5;
        if  (degrees >= (factor * 11) && degrees < (factor * 13))
            text = s6;
        if  (degrees >= (factor * 13) && degrees < (factor * 15))
            text = s7;
        if  (degrees >= (factor * 15) && degrees < (factor * 17))
            text = s8;
        if  (degrees >= (factor * 17) && degrees < (factor * 19))
            text = s9;
        if  (degrees >= (factor * 19) && degrees < (factor * 21))
            text = s10;
        if  (degrees >= (factor * 21) && degrees < (factor * 23))
            text = s11;
        if ((degrees >= (factor * 23) && degrees <  360) || (degrees >=  0 && degrees < (factor * 1))) {
            text = s12;
        }

        return text;
    }
    public void openActivityTwo() {
        Intent intent2 = new Intent(this, Main2Activity.class);
        startActivity(intent2);
    }
}
