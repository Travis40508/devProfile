package com.profile.rodneytressler.devprofile.Views.WebScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.profile.rodneytressler.devprofile.Di.ApplicationClass;
import com.profile.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentWeb extends Fragment implements  WebView{
  @Inject protected WebPresenter presenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_web, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentWeb newInstance() {
     Bundle args = new Bundle();
     FragmentWeb fragment = new FragmentWeb();
    fragment.setArguments(args);
    return fragment;
  }

  @OnClick({R.id.image_beatles, R.id.image_tictactoe, R.id.image_dev_profile})
  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.image_beatles :
        presenter.setState("beatles");
        break;
      case R.id.image_tictactoe :
        presenter.setState("tictactoe");
        break;
      case R.id.image_dev_profile :
        presenter.setState("developer");
        break;
    }
  }
}
