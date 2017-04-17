package com.example.rodneytressler.devprofile.Views.ContactScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class ContactPresenter {
  private IStateService iStateService;

  private ContactView view;

  @Inject
  public ContactPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public ContactView getView() {
    return view;
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
