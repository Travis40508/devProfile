package com.profile.rodneytressler.devprofile.Views.AboutScreen;

import com.profile.rodneytressler.devprofile.StateService.IStateService;
import com.profile.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class AboutPresenter extends BasePresenter<AboutView> {


  @Inject
  public AboutPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentAbout fragmentAbout) {
    this.view = fragmentAbout;
    if(view != null) {

    }
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
