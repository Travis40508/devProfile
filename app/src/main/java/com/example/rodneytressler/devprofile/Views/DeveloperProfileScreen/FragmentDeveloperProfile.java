package com.example.rodneytressler.devprofile.Views.DeveloperProfileScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class FragmentDeveloperProfile extends Fragment implements DeveloperProfileView {
  @Inject protected DeveloperProfilePresenter presenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_developer_profile, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentDeveloperProfile newInstance() {
     Bundle args = new Bundle();
     FragmentDeveloperProfile fragment = new FragmentDeveloperProfile();
    fragment.setArguments(args);
    return fragment;
  }
}
