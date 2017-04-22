package com.dev.rodneytressler.devprofile.Views.Header;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class HeaderPresenter extends BasePresenter<HeaderView>{

  @Inject
  public HeaderPresenter(IStateService iStateService) {
    super(iStateService);
  }

  public void setView(Header header) {
    this.view = header;
    if(view != null) {
      loadStateList();
      listenForStateChanges();
    }
  }

  /** Listens for state changes in the application and changes the header accordingly.
   * Knows what current state is due to parent abstract class it's inheriting. */

  private void listenForStateChanges() {
    iStateService.getStateList()
        .subscribe(states -> {
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
