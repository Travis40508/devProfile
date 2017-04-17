package com.example.rodneytressler.devprofile.Views.AndroidScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class AndroidPresenter {
  private IStateService iStateService;

  private AndroidView view;

  @Inject
  public AndroidPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public AndroidView getView() {
    return view;
  }

  public void setView(FragmentAndroid fragmentAndroid) {
    this.view = fragmentAndroid;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
