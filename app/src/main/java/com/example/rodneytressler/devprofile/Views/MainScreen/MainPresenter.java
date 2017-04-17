package com.example.rodneytressler.devprofile.Views.MainScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import java.util.ArrayList;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class MainPresenter {

  private IStateService iStateService;
  private MainView view;

  @Inject
  public MainPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public void setView(MainActivity mainActivity) {
    this.view = mainActivity;
    if(view != null) {
      getView().loadPagerAdapter();
      getView().listenForPageChanges();
      listenForStateChanges();
    }
  }

  private void listenForStateChanges() {
    iStateService.getStateList()
        .subscribe(strings -> {
          if((strings.get(strings.size() - 1).contains("about"))) {
            getView().moveToAbout();
          } else if ((strings.get(strings.size() - 1).contains("android"))) {
            getView().moveToAndroid();
          } else if ((strings.get(strings.size() - 1).contains("web"))) {
            getView().moveToWeb();
          } else if ((strings.get(strings.size() - 1).contains("contact"))) {
            getView().moveToContact();
          } else if ((strings.get(strings.size() - 1).contains("education"))) {
            getView().attachEducation();
          } else if ((strings.get(strings.size() - 1).contains("skills"))) {
            getView().attachSkills();
          } else if ((strings.get(strings.size() - 1).contains("experience"))) {
            getView().attachExperience();
          } else if ((strings.get(strings.size() - 1).contains("facts"))) {
            getView().attachFacts();
          } else if ((strings.get(strings.size() - 1).contains("restaurant"))) {
            getView().attachRestaurant();
          } else if ((strings.get(strings.size() - 1).contains("tekesports"))) {
            getView().attachTekeSports();
          } else if ((strings.get(strings.size() - 1).contains("scribblit"))) {
            getView().attachScribblit();
          } else if ((strings.get(strings.size() - 1).contains("powermap"))) {
            getView().attachPowerMap();
          } else if ((strings.get(strings.size() - 1).contains("beatles"))) {
            getView().attachBeatles();
          } else if ((strings.get(strings.size() - 1).contains("tictactoe"))) {
            getView().attachTicTacToe();
          } else if ((strings.get(strings.size() - 1).contains("developer"))) {
            getView().attachDeveloperProfile();
          }
        });
  }

  public MainView getView() {
    return view;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }

  public void backPressed() {
    iStateService.getStateList()
        .first(new ArrayList<>())
        .subscribe(strings -> {
          if((strings.get(strings.size() - 1).contains("education"))
              || (strings.get(strings.size() - 1).contains("skills"))
            || (strings.get(strings.size() - 1).contains("experience"))
            || (strings.get(strings.size() - 1).contains("facts"))
          || (strings.get(strings.size() - 1).contains("restaurant"))
              || (strings.get(strings.size() - 1).contains("tekesports"))
              || (strings.get(strings.size() - 1).contains("scribblit"))
              || (strings.get(strings.size() - 1).contains("powermap"))){
            iStateService.setState(strings.get(strings.size() - 2));
            getView().detachFragment();
          }
        });
  }
}
