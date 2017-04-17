package com.example.rodneytressler.devprofile.Di;

import com.example.rodneytressler.devprofile.StateService.StateServiceModule;
import com.example.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.example.rodneytressler.devprofile.Views.AndroidScreen.FragmentAndroid;
import com.example.rodneytressler.devprofile.Views.BeatleBargainsScreen.FragmentBeatleBargains;
import com.example.rodneytressler.devprofile.Views.EducationScreen.FragmentEducation;
import com.example.rodneytressler.devprofile.Views.ExperienceScreen.FragmentExperience;
import com.example.rodneytressler.devprofile.Views.FactsScreen.FragmentFacts;
import com.example.rodneytressler.devprofile.Views.Header.Header;
import com.example.rodneytressler.devprofile.Views.MainScreen.MainActivity;
import com.example.rodneytressler.devprofile.Views.PowermapScreen.FragmentPowermap;
import com.example.rodneytressler.devprofile.Views.RestaurantScreen.FragmentRestaurant;
import com.example.rodneytressler.devprofile.Views.ScribblitScreen.FragmentScribblit;
import com.example.rodneytressler.devprofile.Views.SkillsScreen.FragmentSkills;
import com.example.rodneytressler.devprofile.Views.TekeScreen.FragmentTekesports;
import com.example.rodneytressler.devprofile.Views.TicTacToeScreen.FragmentTicTacToe;
import com.example.rodneytressler.devprofile.Views.WebScreen.FragmentWeb;
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
}
