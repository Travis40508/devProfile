package com.dev.rodneytressler.devprofile.Views.TicTacToeScreen;

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
public class TicTacToePresenterTest {
  private TicTacToePresenter ticTacToePresenter;

  @Mock IStateService iStateService;

  @Mock TicTacToeView ticTacToeView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    ticTacToePresenter = new TicTacToePresenter(iStateService);

    ticTacToePresenter.setView(ticTacToeView);

  }

  @Test public void ticTacToeLinkClicked() throws Exception {
    ticTacToePresenter.ticTacToeLinkClicked();

    Mockito.verify(ticTacToeView).launchTicTacToeSite();
  }
}