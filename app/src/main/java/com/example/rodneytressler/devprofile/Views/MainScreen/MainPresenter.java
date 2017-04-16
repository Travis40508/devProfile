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

    }
  }


  public MainView getView() {
    return view;
  }
}
