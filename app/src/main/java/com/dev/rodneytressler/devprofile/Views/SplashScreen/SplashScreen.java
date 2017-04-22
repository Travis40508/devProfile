package com.dev.rodneytressler.devprofile.Views.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import com.dev.rodneytressler.devprofile.R;
import com.dev.rodneytressler.devprofile.Views.MainScreen.MainActivity;

/**
 * Created by rodneytressler on 4/18/17.
 */

public class SplashScreen extends AppCompatActivity {

  /** Sets splash screen for four seconds to give potential employers
   * time to read the screen fully*/

  private final int SPLASH_DISPLAY_LENGTH = 4000;

  @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_splash_screen);

    new Handler().postDelayed(new Runnable() {
      @Override public void run() {
        Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
        SplashScreen.this.startActivity(mainIntent);
        SplashScreen.this.finish();
        startActivity(mainIntent);
      }
    }, SPLASH_DISPLAY_LENGTH);
  }
}
