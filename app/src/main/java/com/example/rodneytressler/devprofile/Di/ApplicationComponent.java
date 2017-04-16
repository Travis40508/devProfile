package com.example.rodneytressler.devprofile.Di;

import com.example.rodneytressler.devprofile.StateService.StateServiceModule;
import com.example.rodneytressler.devprofile.Views.MainScreen.MainActivity;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by rodneytressler on 4/16/17.
 */

@Component(modules = {ApplicationModule.class, StateServiceModule.class})
@Singleton
public interface ApplicationComponent {

  void inject(ApplicationClass target);
  void inject(MainActivity mainActivity);
}
