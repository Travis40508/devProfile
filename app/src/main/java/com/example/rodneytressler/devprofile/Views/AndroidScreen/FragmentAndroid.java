package com.example.rodneytressler.devprofile.Views.AndroidScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentAndroid extends Fragment implements  AndroidView{

  @Inject protected AndroidPresenter presenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_android, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentAndroid newInstance() {
     Bundle args = new Bundle();
     FragmentAndroid fragment = new FragmentAndroid();
    fragment.setArguments(args);
    return fragment;
  }

  @OnClick({R.id.image_restaurant, R.id.image_tekesports, R.id.image_scribblit, R.id.image_powermap})
  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.image_restaurant :
        presenter.setState("restaurant");
        break;
      case R.id.image_tekesports :
        presenter.setState("tekesports");
        break;
      case R.id.image_scribblit :
        presenter.setState("scribblit");
        break;
      case R.id.image_powermap :
        presenter.setState("powermap");
        break;
    }
  }
}
