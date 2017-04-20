package com.profile.rodneytressler.devprofile.Views.Header;

import com.profile.rodneytressler.devprofile.StateService.IStateService;
import com.profile.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class HeaderPresenter extends BasePresenter<HeaderView>{
  private String currentState;

  @Inject
  public HeaderPresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(Header header) {
    this.view = header;
    if(view != null) {
      listenForStateChanges();
    }
  }

  private void listenForStateChanges() {
    iStateService.getStateList()
        .subscribe(strings -> {
          currentState = strings.get(strings.size() - 1);
          if(currentState.contains("about")) {
            getView().unSelectAllIcons();
            getView().setAboutSelected();
          } else if(currentState.contains("android")) {
            getView().unSelectAllIcons();
            getView().setAndroidSelected();
          } else if (currentState.contains("web")) {
            getView().unSelectAllIcons();
            getView().setWebSelected();
          } else if (currentState.contains("contact")) {
            getView().unSelectAllIcons();
            getView().setContactSelected();
          }
        });
  }


  public void buttonClicked(String button) {
    iStateService.setState(button);
  }
}
