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

  void attachEducation();

  void attachSkills();

  void attachExperience();

  void attachFacts();

  void detachFragment();

  void attachRestaurant();

  void attachTekeSports();

  void attachScribblit();

  void attachPowerMap();
}
