package com.example.opensource.VideoPlayback.ui.ActivityList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.example.opensource.R;
import com.example.opensource.VideoPlayback.app.VideoPlayback;

public class ActivitySplashScreen extends Activity
{

    private static long SPLASH_MILLIS = 1000;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LayoutInflater inflater = LayoutInflater.from(this);
        RelativeLayout layout = (RelativeLayout) inflater.inflate(
                R.layout.splash_screen, null, false);

        addContentView(layout, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {

            @Override
            public void run()
            {

//                Intent intent = new Intent(ActivitySplashScreen.this,
//                    AboutScreen.class);
//                intent.putExtra("ACTIVITY_TO_LAUNCH",
//                    "app.VideoPlayback.VideoPlayback");
//                intent.putExtra("ABOUT_TEXT_TITLE", "Video Playback");
//                intent.putExtra("ABOUT_TEXT", "VideoPlayback/VP_about.html");
                Intent intent = new Intent(ActivitySplashScreen.this,
                        VideoPlayback.class);
                startActivity(intent);

            }

        }, SPLASH_MILLIS);
    }

}
