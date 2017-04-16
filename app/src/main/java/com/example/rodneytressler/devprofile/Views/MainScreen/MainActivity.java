package com.example.rodneytressler.devprofile.Views.MainScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView{


@Inject protected MainPresenter mainPresenter;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getApplication()).getComponent().inject(this);
    setContentView(R.layout.activity_main);

    mainPresenter.setView(this);

  }

}
