package com.dev.rodneytressler.devprofile.Views.ContactScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by rodneytressler on 4/22/17.
 */
public class ContactPresenterTest {

  private ContactPresenter contactPresenter;

  @Mock ContactView contactView;

  @Mock IStateService iStateService;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    contactPresenter = new ContactPresenter(iStateService);
    contactPresenter.setView(contactView);
  }

  @Test public void phoneClicked() throws Exception {
    contactPresenter.phoneClicked();

    Mockito.verify(contactView).callNumber();
  }

  @Test public void emailClicked() throws Exception {
    contactPresenter.emailClicked();

    Mockito.verify(contactView).sendEmail();
  }

  @Test public void linkedInClicked() throws Exception {
    contactPresenter.linkedInClicked();

    Mockito.verify(contactView).openLinkedIn();

  }
}