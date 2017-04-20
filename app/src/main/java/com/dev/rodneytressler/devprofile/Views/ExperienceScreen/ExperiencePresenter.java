package com.dev.rodneytressler.devprofile.Views.ExperienceScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class ExperiencePresenter extends BasePresenter<ExperienceView>{

  @Inject
  public ExperiencePresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(FragmentExperience fragmentExperience) {
    this.view = fragmentExperience;
  }

}
