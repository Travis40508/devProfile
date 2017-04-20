package com.example.rodneytressler.devprofile.Views.WebScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import com.example.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class WebPresenter extends BasePresenter<WebView>{

  @Inject
  public WebPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentWeb fragmentWeb) {
    this.view = fragmentWeb;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
