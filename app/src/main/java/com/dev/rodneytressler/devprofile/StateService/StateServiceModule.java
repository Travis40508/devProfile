package com.dev.rodneytressler.devprofile.StateService;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by rodneytressler on 4/16/17.
 */

@Module
public class StateServiceModule {

  @Provides
  @Singleton
  IStateService providesStateService() {
    return new StateServiceImpl();
  }
}
