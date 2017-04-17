package com.example.rodneytressler.devprofile.Views.Header;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class HeaderPresenter {
  private IStateService iStateService;

  private HeaderView view;

  @Inject
  public HeaderPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
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
          if((strings.get(strings.size() - 1).contains("about"))) {
            getView().unSelectAllIcons();
            getView().setAboutSelected();
          } else if((strings.get(strings.size() - 1).contains("android"))) {
            getView().unSelectAllIcons();
            getView().setAndroidSelected();
          } else if ((strings.get(strings.size() - 1).contains("web"))) {
            getView().unSelectAllIcons();
            getView().setWebSelected();
          } else if ((strings.get(strings.size() - 1).contains("contact"))) {
            getView().unSelectAllIcons();
            getView().setContactSelected();
          }
        });
  }

  public HeaderView getView() {
    return view;
  }

  public void buttonClicked(String button) {
    iStateService.setState(button);
  }
}
