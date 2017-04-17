package com.example.rodneytressler.devprofile.Views.AboutScreen;

import android.util.Log;
import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class AboutPresenter  {
  private IStateService iStateService;


  private AboutView view;

  @Inject
  public AboutPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public AboutView getView() {
    return view;
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
