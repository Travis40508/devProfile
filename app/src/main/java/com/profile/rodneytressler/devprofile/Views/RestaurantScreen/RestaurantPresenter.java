package com.profile.rodneytressler.devprofile.Views.RestaurantScreen;

import com.profile.rodneytressler.devprofile.StateService.IStateService;
import com.profile.rodneytressler.devprofile.Tools.BasePresenter;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class RestaurantPresenter extends BasePresenter<RestaurantView>{

  @Inject
  public RestaurantPresenter(IStateService iStateService) {
    super(iStateService);
  }


  public void setView(FragmentRestaurant fragmentRestaurant) {
    this.view = fragmentRestaurant;
  }
}
