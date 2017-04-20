package com.example.rodneytressler.devprofile.Views.TekeScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import com.example.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class TekesportsPresenter extends BasePresenter<TekesportsView>{

  @Inject
  public TekesportsPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentTekesports fragmentTekesports) {
    this.view = fragmentTekesports;
  }
}
