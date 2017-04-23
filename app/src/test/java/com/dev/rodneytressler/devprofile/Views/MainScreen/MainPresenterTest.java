package com.dev.rodneytressler.devprofile.Views.MainScreen;

import com.dev.rodneytressler.devprofile.StateService.IStateService;
import com.dev.rodneytressler.devprofile.StateService.StateServiceImpl;
import io.reactivex.observers.TestObserver;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.stubbing.OngoingStubbing;

import static org.junit.Assert.*;

/**
 * Created by rodneytressler on 4/22/17.
 */
public class MainPresenterTest {
  private MainPresenter mainPresenter;



  private IStateService iStateServiceNonMock;


  @Mock MainPresenter mMainPresenter;

  @Mock IStateService iStateService;

  @Mock MainView mainView;

  @Before public void setUp() throws Exception {
    MockitoAnnotations.initMocks(this);

    iStateServiceNonMock = new StateServiceImpl();

    mainPresenter = new MainPresenter(iStateService);

    mainPresenter.setView(mainView);


    List states = new ArrayList();
    states.add("lastState");
    states.add("currentState");


  }

  @Test public void setState() throws Exception {
    String anyString = Mockito.anyString();

    mainPresenter.setState(anyString);

    Mockito.verify(iStateService).setState(anyString);
  }

  @Test public void backPressed() throws Exception {
    List list = new ArrayList();
    list.add("about");
    list.add("education");

    BehaviorSubject<List<String>> stateList;
    stateList = BehaviorSubject.create();
    stateList.onNext(list);

    Mockito.doReturn(stateList).when(iStateService).getStateList();
    mainPresenter.loadStateList();
    mainPresenter.backPressed();

    Mockito.verify(iStateService).setState("about");
  }

  @Test public void backDetachesFragment() throws Exception {
    List list = new ArrayList();
    list.add("android");
    list.add("restaurant");

    BehaviorSubject<List<String>> stateList = BehaviorSubject.create();
    stateList.onNext(list);

    Mockito.doReturn(stateList).when(iStateService).getStateList();

    mainPresenter.loadStateList();
    mainPresenter.backPressed();

    Mockito.verify(mainView).detachFragment();
  }
}