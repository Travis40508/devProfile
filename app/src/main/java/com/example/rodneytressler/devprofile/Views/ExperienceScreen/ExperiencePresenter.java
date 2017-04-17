package com.example.rodneytressler.devprofile.Views.ExperienceScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class ExperiencePresenter {
  private IStateService iStateService;

  private ExperienceView view;

  @Inject
  public ExperiencePresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public void setView(FragmentExperience fragmentExperience) {
    this.view = fragmentExperience;
  }

  public ExperienceView getView() {
    return view;
  }
}
