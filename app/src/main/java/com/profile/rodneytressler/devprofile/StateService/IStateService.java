package com.profile.rodneytressler.devprofile.StateService;

import io.reactivex.subjects.BehaviorSubject;
import java.util.List;

/**
 * Created by rodneytressler on 4/16/17.
 */

public interface IStateService {
  void setState(String state);
  BehaviorSubject<List<String>> getStateList();
}
