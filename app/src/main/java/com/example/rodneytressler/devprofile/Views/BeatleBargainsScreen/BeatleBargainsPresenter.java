package com.example.rodneytressler.devprofile.Views.BeatleBargainsScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class BeatleBargainsPresenter {
  private IStateService iStateService;

  private BeatleBargainsView view;

  @Inject
  public BeatleBargainsPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public BeatleBargainsView getView() {
    return view;
  }

  public void setView(FragmentBeatleBargains fragmentBeatleBargains) {
    this.view = fragmentBeatleBargains;
  }

  public void beatlesLinkClicked() {
    getView().launchBeatlesPage();
  }
}
