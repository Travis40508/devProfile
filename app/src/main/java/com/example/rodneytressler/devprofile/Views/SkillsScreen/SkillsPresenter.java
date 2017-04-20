package com.example.rodneytressler.devprofile.Views.SkillsScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import com.example.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class SkillsPresenter extends BasePresenter<SkillsView>{

  @Inject
  public SkillsPresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(FragmentSkills fragmentSkills) {
    this.view = fragmentSkills;
    if(view != null) {

    }
  }

}
