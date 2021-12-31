//package com.abhideveloper.animalpedia;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.animation.Animation;
//import android.view.animation.AnimationUtils;
//import android.widget.ImageView;
//
//public class Splash extends AppCompatActivity {
//    Animation anim;
//    ImageView imageView;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//        imageView=(ImageView)findViewById(R.id.imageView2); // Declare an imageView to show the animation.
//        anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in); // Create the animation.
//        anim.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//                startActivity(new Intent(this, MainActivity.class));
//                // HomeActivity.class is the activity to go after showing the splash screen.
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//            }
//        });
//        imageView.startAnimation(anim);
//    }
//}

//reference website --- https://riptutorial.com/android/example/28863/splash-screen-with-animation
