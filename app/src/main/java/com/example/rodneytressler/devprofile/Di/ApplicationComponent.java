package com.example.rodneytressler.devprofile.Di;

import com.example.rodneytressler.devprofile.StateService.StateServiceModule;
import com.example.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.example.rodneytressler.devprofile.Views.EducationScreen.FragmentEducation;
import com.example.rodneytressler.devprofile.Views.Header.Header;
import com.example.rodneytressler.devprofile.Views.MainScreen.MainActivity;
import com.example.rodneytressler.devprofile.Views.SkillsScreen.FragmentSkills;
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

  void inject(Header header);

  void inject(FragmentEducation fragmentEducation);

  void inject(FragmentAbout fragmentAbout);

  void inject(FragmentSkills fragmentSkills);
}
