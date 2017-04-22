package com.dev.rodneytressler.devprofile.Views.MainScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import java.util.ArrayList;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class MainPresenter extends BasePresenter<MainView>{


  @Inject
  public MainPresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(MainActivity mainActivity) {
    this.view = mainActivity;
    if(view != null) {
      loadStateList();
      getView().loadPagerAdapter();
      getView().listenForPageChanges();
      listenForStateChanges();
    }
  }

  private void listenForStateChanges() {
    iStateService.getStateList()
        .subscribe(states -> {
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


  public void setState(String state) {
    iStateService.setState(state);
  }

  public void backPressed() {
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
            }
}
