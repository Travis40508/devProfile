package com.dev.rodneytressler.devprofile.Views.AndroidScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class AndroidPresenter extends BasePresenter<AndroidView>{


  @Inject
  public AndroidPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentAndroid fragmentAndroid) {
    this.view = fragmentAndroid;
  }

  public void setState(String state) {
    iStateService.setState(state);
  }
}
