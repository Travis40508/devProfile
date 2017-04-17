package com.example.rodneytressler.devprofile.Views.EducationScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class EducationPresenter {
  private IStateService iStateService;


  private EducationView view;

  @Inject
  public EducationPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public void setView(FragmentEducation fragmentEducation) {
    this.view = fragmentEducation;
  }

  public EducationView getView() {
    return view;
  }
}
