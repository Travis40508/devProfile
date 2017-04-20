package com.dev.rodneytressler.devprofile.Views.TicTacToeScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class TicTacToePresenter extends BasePresenter<TicTacToeView>{

  @Inject
  public TicTacToePresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentTicTacToe fragmentTicTacToe) {
    this.view = fragmentTicTacToe;
  }

  public void ticTacToeLinkClicked() {
    getView().launchTicTacToeSite();
  }
}