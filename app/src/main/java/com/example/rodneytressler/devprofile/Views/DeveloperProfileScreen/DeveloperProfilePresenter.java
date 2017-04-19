package com.example.rodneytressler.devprofile.Views.DeveloperProfileScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class DeveloperProfilePresenter {
  private IStateService iStateService;

  private DeveloperProfileView view;

  @Inject
  public DeveloperProfilePresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public DeveloperProfileView getView() {
    return view;
  }

  public void setView(FragmentDeveloperProfile fragmentDeveloperProfile) {
    this.view = fragmentDeveloperProfile;
  }

  public void developerProfileLinkClicked() {
    getView().launchDeveloperProfilePage();
  }
}
