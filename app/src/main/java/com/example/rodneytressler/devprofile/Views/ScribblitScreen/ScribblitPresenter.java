package com.example.rodneytressler.devprofile.Views.ScribblitScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class ScribblitPresenter {
  private IStateService iStateService;

  private ScribblitView view;

  @Inject
  public ScribblitPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public ScribblitView getView() {
    return view;
  }

  public void setView(FragmentScribblit fragmentScribblit) {
    this.view = fragmentScribblit;
  }
}
