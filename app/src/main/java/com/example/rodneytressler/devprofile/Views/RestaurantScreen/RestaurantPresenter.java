package com.example.rodneytressler.devprofile.Views.RestaurantScreen;

import com.example.rodneytressler.devprofile.StateService.IStateService;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class RestaurantPresenter {
  private IStateService iStateService;

  private RestaurantView view;

  @Inject
  public RestaurantPresenter(IStateService iStateService) {
    this.iStateService = iStateService;
  }

  public RestaurantView getView() {
    return view;
  }

  public void setView(FragmentRestaurant fragmentRestaurant) {
    this.view = fragmentRestaurant;
  }
}
