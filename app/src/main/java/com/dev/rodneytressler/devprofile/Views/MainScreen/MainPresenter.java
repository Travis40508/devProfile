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

  /** Listens for states changing in the app and tells the view which fragment to move to accordingly. */
  private void listenForStateChanges() {
    iStateService.getStateList()
        .subscribe(states -> {
          if(currentState.equals("about")) {
            getView().moveToAbout();
          } else if (currentState.equals("android")) {
            getView().moveToAndroid();
          } else if (currentState.equals("web")) {
            getView().moveToWeb();
          } else if (currentState.equals("contact")) {
            getView().moveToContact();
          } else if (currentState.equals("education")) {
            getView().attachEducation();
          } else if (currentState.equals("skills")) {
            getView().attachSkills();
          } else if (currentState.equals("experience")) {
            getView().attachExperience();
          } else if (currentState.equals("facts")) {
            getView().attachFacts();
          } else if (currentState.equals("restaurant")) {
            getView().attachRestaurant();
          } else if (currentState.equals("tekesports")) {
            getView().attachTekeSports();
          } else if (currentState.equals("scribblit")) {
            getView().attachScribblit();
          } else if (currentState.equals("powermap")) {
            getView().attachPowerMap();
          } else if (currentState.equals("beatles")) {
            getView().attachBeatles();
          } else if (currentState.equals("tictactoe")) {
            getView().attachTicTacToe();
          } else if (currentState.equals("developer")) {
            getView().attachDeveloperProfile();
          }
        });

  }

  /** Sets state of app based on button press or swipe. */

  public void setState(String state) {
    iStateService.setState(state);
  }

  /** tells view to detach sectional fragment or close app based on current state of app. */

  public void backPressed() {
              if((currentState.equals("education"))
                  || (currentState.equals("skills"))
                  || (currentState.equals("experience"))
                  || (currentState.equals("facts"))
                  || (currentState.equals("restaurant"))
                  || (currentState.equals("tekesports"))
                  || (currentState.equals("scribblit"))
                  || (currentState.equals("powermap"))
                  || (currentState.equals("beatles"))
                  || (currentState.equals("tictactoe"))
                  || (currentState.equals("developer")))
              {
                iStateService.setState(lastState);
                getView().detachFragment();
              }
              else {
                getView().superBack();
              }
            }
}
