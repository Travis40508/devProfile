package com.example.rodneytressler.devprofile.Views.MainScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.example.rodneytressler.devprofile.R;

public class MainActivity extends AppCompatActivity implements MainView{

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
