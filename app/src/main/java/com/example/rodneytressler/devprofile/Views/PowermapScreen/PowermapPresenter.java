package com.example.rodneytressler.devprofile.Views.PowermapScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class PowermapPresenter {
  private IStateService iStateService;

  private PowermapView view;

  @Inject
  public PowermapPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public PowermapView getView() {
    return view;
  }

  public void setView(FragmentPowermap fragmentPowermap) {
    this.view = fragmentPowermap;
  }
}
