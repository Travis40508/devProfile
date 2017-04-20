package com.profile.rodneytressler.devprofile.Di;

import android.app.Application;
import com.profile.rodneytressler.devprofile.StateService.StateServiceModule;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class ApplicationClass extends Application {

  private ApplicationComponent applicationComponent;
  private StateServiceModule stateServiceModule;
  private ApplicationModule applicationModule;

  @Override public void onCreate() {
    super.onCreate();

    stateServiceModule = new StateServiceModule();
    applicationModule = new ApplicationModule(this);
    applicationComponent = DaggerApplicationComponent.builder()
                          .applicationModule(applicationModule)
                          .stateServiceModule(stateServiceModule)
                          .build();
  }

  public ApplicationComponent getComponent() {
    return applicationComponent;
  }
}
