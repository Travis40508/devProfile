package com.profile.rodneytressler.devprofile.Views.TekeScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.profile.rodneytressler.devprofile.Di.ApplicationClass;
import com.profile.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class FragmentTekesports extends Fragment implements TekesportsView {
  @Inject protected TekesportsPresenter presenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_tekesports, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentTekesports newInstance() {
     Bundle args = new Bundle();
     FragmentTekesports fragment = new FragmentTekesports();
    fragment.setArguments(args);
    return fragment;
  }
}
