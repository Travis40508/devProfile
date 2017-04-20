package com.profile.rodneytressler.devprofile.Views.PowermapScreen;

import com.profile.rodneytressler.devprofile.StateService.IStateService;
import com.profile.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class PowermapPresenter extends BasePresenter<PowermapView>{

  @Inject
  public PowermapPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentPowermap fragmentPowermap) {
    this.view = fragmentPowermap;
  }
}
