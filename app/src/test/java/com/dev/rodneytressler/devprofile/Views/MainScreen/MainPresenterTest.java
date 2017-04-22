package com.dev.rodneytressler.devprofile.Views.MainScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.StateService.StateServiceImpl;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subscribers.TestSubscriber;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by rodneytressler on 4/22/17.
 */
public class MainPresenterTest {
  private MainPresenter mainPresenter;

  private BehaviorSubject<List<String>> stateList;

  private String currentState;

  private IStateService iStateServiceNonMock;


  @Mock IStateService iStateService;

  @Mock MainView mainView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    mainPresenter = new MainPresenter(iStateService);

    mainPresenter.setView(mainView);

    stateList = BehaviorSubject.create();
    List states = new ArrayList();
    states.add("lastState");
    states.add("currentState");
    stateList.onNext(states);

    iStateServiceNonMock = new StateServiceImpl();

  }

  @Test public void setState() throws Exception {
    String anyString = Mockito.anyString();

    mainPresenter.setState(anyString);

    Mockito.verify(iStateService).setState(anyString);
  }

  @Test public void backPressed() throws Exception {

  }
}