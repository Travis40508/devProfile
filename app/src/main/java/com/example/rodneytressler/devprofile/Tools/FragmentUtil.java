package com.example.rodneytressler.devprofile.Tools;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import javax.inject.Singleton;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentUtil {

  public static FragmentManager fragmentManager;
  public static FragmentTransaction fragmentTransaction;

  @Singleton
  public FragmentUtil(FragmentManager fragmentManager) {
    this.fragmentManager = fragmentManager;
  }

  public static void attachFragment(Fragment fragment, int id, int enterAnim, int exitAnim) {
    fragmentTransaction = fragmentManager.beginTransaction();
    fragmentTransaction.setCustomAnimations(enterAnim, exitAnim);
    fragmentTransaction.replace(id, fragment);
    fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
    fragmentTransaction.commit();
  }

  public static void detachFragment(int id, int enterAnim, int exitAnim) {
    fragmentManager.beginTransaction()
        .setCustomAnimations(enterAnim, exitAnim)
        .remove(fragmentManager.findFragmentById(id))
        .commit();
  }

  public static void replaceFragment() {

  }
}
