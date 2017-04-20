package com.example.rodneytressler.devprofile.Tools;

import android.support.annotation.Nullable;
import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/19/17.
 */

public abstract class BasePresenter<T> {
  protected IStateService iStateService;

  @Nullable protected T view;

  protected BasePresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  @Nullable protected T getView() {
    return view;
  }

  public void setView(T view) {
    this.view = view;
  }
}
