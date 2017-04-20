package com.example.rodneytressler.devprofile.Views.DeveloperProfileScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import com.example.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class DeveloperProfilePresenter extends BasePresenter<DeveloperProfileView>{

  @Inject
  public DeveloperProfilePresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentDeveloperProfile fragmentDeveloperProfile) {
    this.view = fragmentDeveloperProfile;
  }

  public void developerProfileLinkClicked() {
    getView().launchDeveloperProfilePage();
  }
}
