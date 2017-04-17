package com.example.rodneytressler.devprofile.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
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

    }

  }

  @Override public int getCount() {
    return 0;
  }
}
