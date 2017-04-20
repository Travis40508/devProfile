package com.dev.rodneytressler.devprofile.Views.EducationScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class EducationPresenter extends BasePresenter<EducationView>{

  @Inject
  public EducationPresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(FragmentEducation fragmentEducation) {
    this.view = fragmentEducation;
  }

}
