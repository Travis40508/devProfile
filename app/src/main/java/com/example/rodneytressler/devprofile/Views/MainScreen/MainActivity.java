package com.example.rodneytressler.devprofile.Views.MainScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import com.example.rodneytressler.devprofile.Tools.FragmentUtil;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView{


@Inject protected MainPresenter mainPresenter;
  private FragmentUtil fragmentUtil;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getApplication()).getComponent().inject(this);
    setContentView(R.layout.activity_main);

    fragmentUtil = new FragmentUtil(getSupportFragmentManager());
    mainPresenter.setView(this);

  }

}
