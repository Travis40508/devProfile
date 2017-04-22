package com.dev.rodneytressler.devprofile.Views.DeveloperProfileScreen;

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
public class DeveloperProfilePresenterTest {
  private DeveloperProfilePresenter developerProfilePresenter;

  @Mock IStateService iStateService;

  @Mock DeveloperProfileView developerProfileView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    developerProfilePresenter = new DeveloperProfilePresenter(iStateService);

    developerProfilePresenter.setView(developerProfileView);
  }

  @Test public void developerProfileLinkClicked() throws Exception {
    developerProfilePresenter.developerProfileLinkClicked();

    Mockito.verify(developerProfileView).launchDeveloperProfilePage();
  }
}