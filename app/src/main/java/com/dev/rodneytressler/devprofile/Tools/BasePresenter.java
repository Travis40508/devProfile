package com.dev.rodneytressler.devprofile.Tools;

import android.support.annotation.Nullable;
import com.dev.rodneytressler.devprofile.StateService.IStateService;
import java.util.List;

/**
 * Created by rodneytressler on 4/19/17.
 */

public abstract class BasePresenter<T> {
  protected IStateService iStateService;
  protected String currentState;
  protected String lastState;
  protected List stateList;

  @Nullable protected T view;

  /** Used as a parent presenter for other presenters. Assigns values for current and last app states.*/

  protected BasePresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }



  @Nullable protected T getView() {
    return view;
  }

  public void setView(T view) {
    this.view = view;

  }

  public void loadStateList() {
    iStateService.getStateList()
        .subscribe(strings -> {
          stateList = strings;
          currentState = strings.get(strings.size() - 1);
          try {
            lastState = strings.get(strings.size() - 2);
          } catch (Exception e) {}
        });
  }

}
