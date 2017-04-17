package com.example.rodneytressler.devprofile.Views.WebScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.example.rodneytressler.devprofile.R;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentWeb extends Fragment {

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_web, container, false);
    ButterKnife.bind(this, view);
    return view;
  }

  public static FragmentWeb newInstance() {
     Bundle args = new Bundle();
     FragmentWeb fragment = new FragmentWeb();
    fragment.setArguments(args);
    return fragment;
  }
}
