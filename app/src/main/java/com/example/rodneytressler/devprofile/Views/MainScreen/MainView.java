package com.example.rodneytressler.devprofile.Views.MainScreen;

/**
 * Created by rodneytressler on 4/16/17.
 */

public interface MainView {
  void loadPagerAdapter();

  void listenForPageChanges();

  void moveToAbout();

  void moveToAndroid();

  void moveToWeb();

  void moveToContact();
}
