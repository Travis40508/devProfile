package com.dev.rodneytressler.devprofile.Views.AboutScreen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.dev.rodneytressler.devprofile.Di.ApplicationClass;
import com.dev.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentAbout extends Fragment implements AboutView{

  @Inject protected AboutPresenter presenter;
  @BindView(R.id.image_education) ImageView educationIcon;
  @BindView(R.id.image_skills) ImageView skillsIcon;
  @BindView(R.id.image_experience) ImageView experienceIcon;
  @BindView(R.id.image_facts) ImageView factsIcon;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_about, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentAbout newInstance() {
     Bundle args = new Bundle();
     FragmentAbout fragment = new FragmentAbout();
    fragment.setArguments(args);
    return fragment;
  }

  @OnClick({R.id.image_education, R.id.image_skills, R.id.image_experience, R.id.image_facts})
  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.image_education :
        presenter.setState("education");
        break;
      case R.id.image_skills :
        presenter.setState("skills");
        break;
      case R.id.image_experience :
        presenter.setState("experience");
        break;
      case R.id.image_facts :
        presenter.setState("facts");
        break;
    }
  }
}
