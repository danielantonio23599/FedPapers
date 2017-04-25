package com.example.daniel.fedpapers;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

public class SplashActivity extends Activity implements Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler Splash = new Handler();
        Splash.postDelayed(SplashActivity.this, 3000 );
    }

    @Override
    public void run() {
        startActivity(new Intent(SplashActivity.this,LoguinActivity.class));
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
       return true;
   }
}
