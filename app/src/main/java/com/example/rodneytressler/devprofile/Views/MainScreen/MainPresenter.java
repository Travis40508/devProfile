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
  private String currentState;
  private String lastState;

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
          currentState = strings.get(strings.size() - 1);
          if(currentState.contains("about")) {
            getView().moveToAbout();
          } else if (currentState.contains("android")) {
            getView().moveToAndroid();
          } else if (currentState.contains("web")) {
            getView().moveToWeb();
          } else if (currentState.contains("contact")) {
            getView().moveToContact();
          } else if (currentState.contains("education")) {
            getView().attachEducation();
          } else if (currentState.contains("skills")) {
            getView().attachSkills();
          } else if (currentState.contains("experience")) {
            getView().attachExperience();
          } else if (currentState.contains("facts")) {
            getView().attachFacts();
          } else if (currentState.contains("restaurant")) {
            getView().attachRestaurant();
          } else if (currentState.contains("tekesports")) {
            getView().attachTekeSports();
          } else if (currentState.contains("scribblit")) {
            getView().attachScribblit();
          } else if (currentState.contains("powermap")) {
            getView().attachPowerMap();
          } else if (currentState.contains("beatles")) {
            getView().attachBeatles();
          } else if (currentState.contains("tictactoe")) {
            getView().attachTicTacToe();
          } else if (currentState.contains("developer")) {
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
            try {
              lastState = strings.get(strings.size() - 2);
              if((currentState.contains("education"))
                  || (currentState.contains("skills"))
                  || (currentState.contains("experience"))
                  || (currentState.contains("facts"))
                  || (currentState.contains("restaurant"))
                  || (currentState.contains("tekesports"))
                  || (currentState.contains("scribblit"))
                  || (currentState.contains("powermap"))
                  || (currentState.contains("beatles"))
                  || (currentState.contains("tictactoe"))
                  || (currentState.contains("developer")))
              {
                iStateService.setState(lastState);
                getView().detachFragment();
              }
              else {
                getView().superBack();
              }
            } catch (Exception e) {
              getView().superBack();
            }

          });
  }
}
