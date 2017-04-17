package com.example.rodneytressler.devprofile.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.example.rodneytressler.devprofile.Views.AndroidScreen.FragmentAndroid;
import com.example.rodneytressler.devprofile.Views.ContactScreen.FragmentContact;
import com.example.rodneytressler.devprofile.Views.WebScreen.FragmentWeb;
import java.util.List;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {
private List<Fragment> fragments;

  public FragmentPageAdapter(FragmentManager fm, List<Fragment> fragmentList) {
    super(fm);
    this.fragments = fragmentList;
  }

  @Override public Fragment getItem(int position) {
    switch (position) {
      case 0 :
        FragmentAbout fragmentAbout = new FragmentAbout();
        return fragmentAbout;
      case 1 :
        FragmentAndroid fragmentAndroid = new FragmentAndroid();
        return fragmentAndroid;
      case 2 :
        FragmentWeb fragmentWeb = new FragmentWeb();
        return fragmentWeb;
      case 3 :
        FragmentContact fragmentContact = new FragmentContact();
        return fragmentContact;
    }
    return null;

  }

  @Override public int getCount() {
    return 4;
  }
}
