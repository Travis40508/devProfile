package com.example.rodneytressler.devprofile.Views.FactsScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class FactsPresenter {
  IStateService iStateService;

  FactsView view;

  @Inject
  public FactsPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public FactsView getView() {
    return view;
  }

  public void setView(FragmentFacts fragmentFacts) {
    this.view = fragmentFacts;
  }
}
