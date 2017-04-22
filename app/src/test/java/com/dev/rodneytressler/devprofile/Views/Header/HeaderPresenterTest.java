package com.dev.rodneytressler.devprofile.Views.Header;

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
public class HeaderPresenterTest {
  private HeaderPresenter headerPresenter;

  @Mock IStateService iStateService;

  @Mock HeaderView headerView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    headerPresenter = new HeaderPresenter(iStateService);

    headerPresenter.setView(headerView);
  }

  @Test public void buttonClicked() throws Exception {
    String anyString = Mockito.anyString();

    headerPresenter.buttonClicked(anyString);

    Mockito.verify(iStateService).setState(anyString);
  }
}