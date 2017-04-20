package com.dev.rodneytressler.devprofile.Di;

import com.dev.rodneytressler.devprofile.StateService.StateServiceModule;
import com.dev.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.dev.rodneytressler.devprofile.Views.AndroidScreen.FragmentAndroid;
import com.dev.rodneytressler.devprofile.Views.BeatleBargainsScreen.FragmentBeatleBargains;
import com.dev.rodneytressler.devprofile.Views.ContactScreen.FragmentContact;
import com.dev.rodneytressler.devprofile.Views.DeveloperProfileScreen.FragmentDeveloperProfile;
import com.dev.rodneytressler.devprofile.Views.EducationScreen.FragmentEducation;
import com.dev.rodneytressler.devprofile.Views.ExperienceScreen.FragmentExperience;
import com.dev.rodneytressler.devprofile.Views.FactsScreen.FragmentFacts;
import com.dev.rodneytressler.devprofile.Views.Header.Header;
import com.dev.rodneytressler.devprofile.Views.MainScreen.MainActivity;
import com.dev.rodneytressler.devprofile.Views.PowermapScreen.FragmentPowermap;
import com.dev.rodneytressler.devprofile.Views.RestaurantScreen.FragmentRestaurant;
import com.dev.rodneytressler.devprofile.Views.ScribblitScreen.FragmentScribblit;
import com.dev.rodneytressler.devprofile.Views.SkillsScreen.FragmentSkills;
import com.dev.rodneytressler.devprofile.Views.TekeScreen.FragmentTekesports;
import com.dev.rodneytressler.devprofile.Views.TicTacToeScreen.FragmentTicTacToe;
import com.dev.rodneytressler.devprofile.Views.WebScreen.FragmentWeb;
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

  void inject(FragmentExperience fragmentExperience);

  void inject(FragmentFacts fragmentFacts);

  void inject(FragmentAndroid fragmentAndroid);

  void inject(FragmentRestaurant fragmentRestaurant);

  void inject(FragmentTekesports fragmentTekesports);

  void inject(FragmentScribblit fragmentScribblit);

  void inject(FragmentPowermap fragmentPowermap);

  void inject(FragmentWeb fragmentWeb);

  void inject(FragmentBeatleBargains fragmentBeatleBargains);

  void inject(FragmentTicTacToe fragmentTicTacToe);

  void inject(FragmentDeveloperProfile fragmentDeveloperProfile);

  void inject(FragmentContact fragmentContact);
}
