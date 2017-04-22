package com.dev.rodneytressler.devprofile.StateService;

import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class StateServiceImpl implements IStateService {


  /** Sets up an observable stateList so that presenters can detect when the app state changes. */

  public BehaviorSubject<List<String>> stateList;

  public StateServiceImpl() {
    stateList = BehaviorSubject.create();
    init();
  }

  /** Makes Statelist have an initial state, the About fragment. */
  public void init() {
    ArrayList<String> newState = new ArrayList<>();
    newState.add("about");

    stateList.onNext(newState);
  }

  /** Overrides initial state guidelines for stateList and makes it return all states after
   * Inital state has been set.*/
  @Override public void setState(String state) {
    List<String> states = stateList.getValue();

    states.add(state);

    stateList.onNext(states);
  }

  /** Returns list of states to subscribers in presenter classes. */
  @Override public BehaviorSubject<List<String>> getStateList() {
    return stateList;
  }
}
