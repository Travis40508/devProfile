package com.example.rodneytressler.devprofile.Views.FactsScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import com.example.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class FactsPresenter extends BasePresenter<FactsView>{

  @Inject
  public FactsPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentFacts fragmentFacts) {
    this.view = fragmentFacts;
  }
}
