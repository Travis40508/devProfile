package com.example.rodneytressler.devprofile.Views.MainScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
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
          }
        });
  }

  public MainView getView() {
    return view;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
