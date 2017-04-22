package com.dev.rodneytressler.devprofile.Di;

import android.app.Application;
import android.content.Context;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by rodneytressler on 4/16/17.
 */

@Module
public class ApplicationModule {

  private Application application;

  public ApplicationModule(Application application) {
    this.application = application;
  }


  /** Allows injection of Application Context with DI */
  @Provides
  @Singleton
  public Context provideContext() {
    return application;
  }
}
