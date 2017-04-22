package com.dev.rodneytressler.devprofile.Views.AboutScreen;

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
public class AboutPresenterTest {

  private AboutPresenter aboutPresenter;

  @Mock IStateService iStateService;
  @Mock AboutView aboutView;



  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);
    aboutPresenter = new AboutPresenter(iStateService);
    aboutPresenter.setView(aboutView);
  }

  @Test public void setState() throws Exception {
    String anyString = Mockito.anyString();

    aboutPresenter.setState(anyString);

    Mockito.verify(iStateService).setState(anyString);
  }
}