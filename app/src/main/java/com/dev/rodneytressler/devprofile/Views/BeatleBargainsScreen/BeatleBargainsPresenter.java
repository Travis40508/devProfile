package com.dev.rodneytressler.devprofile.Views.BeatleBargainsScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class BeatleBargainsPresenter extends BasePresenter<BeatleBargainsView>{


  @Inject
  public BeatleBargainsPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentBeatleBargains fragmentBeatleBargains) {
    this.view = fragmentBeatleBargains;
  }

  public void beatlesLinkClicked() {
    getView().launchBeatlesPage();
  }
}