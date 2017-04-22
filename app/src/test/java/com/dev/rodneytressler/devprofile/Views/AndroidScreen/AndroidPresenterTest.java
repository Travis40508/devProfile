package com.dev.rodneytressler.devprofile.Views.AndroidScreen;

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
public class AndroidPresenterTest {
  private AndroidPresenter androidPresenter;

  @Mock IStateService iStateService;

  @Mock AndroidView androidView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    androidPresenter = new AndroidPresenter(iStateService);

    androidPresenter.setView(androidView);
  }

  @Test public void setState() throws Exception {
    String anyString = Mockito.anyString();

    androidPresenter.setState(anyString);

    Mockito.verify(iStateService).setState(anyString);
  }
}