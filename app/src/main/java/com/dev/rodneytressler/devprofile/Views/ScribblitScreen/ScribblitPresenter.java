package com.dev.rodneytressler.devprofile.Views.ScribblitScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class ScribblitPresenter extends BasePresenter<ScribblitView>{

  @Inject
  public ScribblitPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentScribblit fragmentScribblit) {
    this.view = fragmentScribblit;
  }
}
