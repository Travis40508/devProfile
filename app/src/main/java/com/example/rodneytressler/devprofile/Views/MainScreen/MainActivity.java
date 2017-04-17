package com.example.rodneytressler.devprofile.Views.MainScreen;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.example.rodneytressler.devprofile.Adapters.FragmentPageAdapter;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import com.example.rodneytressler.devprofile.Tools.FragmentUtil;
import com.example.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.example.rodneytressler.devprofile.Views.AndroidScreen.FragmentAndroid;
import com.example.rodneytressler.devprofile.Views.ContactScreen.FragmentContact;
import com.example.rodneytressler.devprofile.Views.EducationScreen.FragmentEducation;
import com.example.rodneytressler.devprofile.Views.ExperienceScreen.FragmentExperience;
import com.example.rodneytressler.devprofile.Views.FactsScreen.FragmentFacts;
import com.example.rodneytressler.devprofile.Views.RestaurantScreen.FragmentRestaurant;
import com.example.rodneytressler.devprofile.Views.SkillsScreen.FragmentSkills;
import com.example.rodneytressler.devprofile.Views.WebScreen.FragmentWeb;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView{


@Inject protected MainPresenter mainPresenter;
  private FragmentUtil fragmentUtil;
  private List<Fragment> fragmentList = new ArrayList();
  private FragmentPagerAdapter fragmentPagerAdapter;
  @BindView(R.id.view_pager) ViewPager viewPager;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    fragmentUtil = new FragmentUtil(getSupportFragmentManager());
    ((ApplicationClass)getApplication()).getComponent().inject(this);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);

    mainPresenter.setView(this);

  }

  @Override public void loadPagerAdapter() {
    fragmentList.add(FragmentAbout.newInstance());
    fragmentList.add(FragmentAndroid.newInstance());
    fragmentList.add(FragmentWeb.newInstance());
    fragmentList.add(FragmentContact.newInstance());

    fragmentPagerAdapter = new FragmentPageAdapter(getSupportFragmentManager(), fragmentList);
    viewPager.setAdapter(fragmentPagerAdapter);
  }

  @Override public void listenForPageChanges() {
    viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
      @Override
      public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

      }

      @Override public void onPageSelected(int position) {
        switch(position) {
          case 0 :
            mainPresenter.setState("about");
            break;
          case 1 :
            mainPresenter.setState("android");
            break;
          case 2 :
            mainPresenter.setState("web");
            break;
          case 3 :
            mainPresenter.setState("contact");
        }
      }

      @Override public void onPageScrollStateChanged(int state) {

      }
    });
  }

  @Override public void moveToAbout() {
    viewPager.setCurrentItem(0);
  }

  @Override public void moveToAndroid() {
    viewPager.setCurrentItem(1);
  }

  @Override public void moveToWeb() {
    viewPager.setCurrentItem(2);
  }

  @Override public void moveToContact() {
    viewPager.setCurrentItem(3);
  }

  @Override public void attachEducation() {
    fragmentUtil.attachFragment(FragmentEducation.newInstance(), R.id.frame_layout, R.anim.slide_in_right,
        R.anim.slide_out_left);
  }

  @Override public void attachSkills() {
    fragmentUtil.attachFragment(FragmentSkills.newInstance(), R.id.frame_layout, R.anim.slide_in_right,
        R.anim.slide_out_left);
  }

  @Override public void attachExperience() {
    fragmentUtil.attachFragment(FragmentExperience.newInstance(), R.id.frame_layout,
        R.anim.slide_in_right, R.anim.slide_out_left);
  }

  @Override public void attachFacts() {
    fragmentUtil.attachFragment(FragmentFacts.newInstance(), R.id.frame_layout,
        R.anim.slide_in_right, R.anim.slide_out_left);
  }

  @Override public void detachFragment() {
    fragmentUtil.detachFragment(R.id.frame_layout, R.anim.slide_in_left, R.anim.slide_out_right);
  }

  @Override public void attachRestaurant() {
    fragmentUtil.attachFragment(FragmentRestaurant.newInstance(), R.id.frame_layout,
        R.anim.slide_in_right, R.anim.slide_out_left);
  }

  @Override public void attachTekeSports() {

  }

  @Override public void attachScribblit() {

  }

  @Override public void attachPowerMap() {

  }

  @Override public void onBackPressed() {
    //super.onBackPressed();
    mainPresenter.backPressed();
  }
}
