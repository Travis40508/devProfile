package com.dev.rodneytressler.devprofile.Views.WebScreen;

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
public class WebPresenterTest {
  private WebPresenter webPresenter;

  @Mock IStateService iStateService;

  @Mock WebView webView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    webPresenter = new WebPresenter(iStateService);

    webPresenter.setView(webView);
  }

  @Test public void setState() throws Exception {
    String anyState = Mockito.anyString();

    webPresenter.setState(anyState);

    Mockito.verify(iStateService).setState(anyState);
  }
}