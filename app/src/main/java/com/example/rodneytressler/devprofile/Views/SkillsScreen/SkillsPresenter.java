package com.example.rodneytressler.devprofile.Views.SkillsScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class SkillsPresenter {
  private IStateService iStateService;


  private SkillsView view;

  @Inject
  public SkillsPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public void setView(FragmentSkills fragmentSkills) {
    this.view = fragmentSkills;
    if(view != null) {

    }
  }

  public SkillsView getView() {
    return view;
  }
}
