package com.example.rodneytressler.devprofile.StateService;

import io.reactivex.subjects.BehaviorSubject;
import java.util.List;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class StateServiceImpl implements IStateService {



  public BehaviorSubject<List<String>> stateList;

  public StateServiceImpl() {
    stateList = BehaviorSubject.create();
  }

  @Override public void setState(String state) {
    List<String> states = stateList.getValue();

    states.add(state);

    stateList.onNext(states);
  }

  @Override public BehaviorSubject<List<String>> getStateList() {
    return stateList;
  }
}
