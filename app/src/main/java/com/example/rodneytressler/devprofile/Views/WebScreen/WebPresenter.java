package com.example.rodneytressler.devprofile.Views.WebScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class WebPresenter {
  private IStateService iStateService;

  private WebView view;

  @Inject
  public WebPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public WebView getView() {
    return view;
  }

  public void setView(FragmentWeb fragmentWeb) {
    this.view = fragmentWeb;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
