package com.example.rodneytressler.devprofile.Views.TicTacToeScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class TicTacToePresenter {
  private IStateService iStateService;

  private TicTacToeView view;

  @Inject
  public TicTacToePresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public TicTacToeView getView() {
    return view;
  }

  public void setView(FragmentTicTacToe fragmentTicTacToe) {
    this.view = fragmentTicTacToe;
  }
}
