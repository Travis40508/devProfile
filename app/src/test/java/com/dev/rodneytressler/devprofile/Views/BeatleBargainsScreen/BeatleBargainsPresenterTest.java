package com.dev.rodneytressler.devprofile.Views.BeatleBargainsScreen;

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
public class BeatleBargainsPresenterTest {
  private BeatleBargainsPresenter beatleBargainsPresenter;

  @Mock IStateService iStateService;

  @Mock BeatleBargainsView beatleBargainsView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    beatleBargainsPresenter = new BeatleBargainsPresenter(iStateService);
    beatleBargainsPresenter.setView(beatleBargainsView);
  }

  @Test public void beatlesLinkClicked() throws Exception {
    beatleBargainsPresenter.beatlesLinkClicked();

    Mockito.verify(beatleBargainsView).launchBeatlesPage();
  }
}