package com.dev.rodneytressler.devprofile.Views.ContactScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class ContactPresenter extends BasePresenter<ContactView>{


  @Inject
  public ContactPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentContact fragmentContact) {
    this.view = fragmentContact;
  }

  public void phoneClicked() {
    getView().callNumber();
  }

  public void emailClicked() {
    getView().sendEmail();
  }

  public void linkedInClicked() {
    getView().openLinkedIn();
  }
}