package com.example.rodneytressler.devprofile.Views.TekeScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class TekesportsPresenter {
  private IStateService iStateService;

  private TekesportsView view;

  @Inject
  public TekesportsPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public TekesportsView getView() {
    return view;
  }

  public void setView(FragmentTekesports fragmentTekesports) {
    this.view = fragmentTekesports;
  }
}
