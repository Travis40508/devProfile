package com.dev.rodneytressler.devprofile.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.dev.rodneytressler.devprofile.Views.AboutScreen.FragmentAbout;
import com.dev.rodneytressler.devprofile.Views.AndroidScreen.FragmentAndroid;
import com.dev.rodneytressler.devprofile.Views.ContactScreen.FragmentContact;
import com.dev.rodneytressler.devprofile.Views.WebScreen.FragmentWeb;
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

  /** Assigns specific fragments to specific pages in the ViewPager */

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

  /** Returns proper number of pages */
  @Override public int getCount() {
    return 4;
  }
}
