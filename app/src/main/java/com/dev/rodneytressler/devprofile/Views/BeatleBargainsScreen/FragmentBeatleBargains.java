package com.dev.rodneytressler.devprofile.Views.BeatleBargainsScreen;

import android.content.Intent;
import android.net.Uri;
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
 * Created by rodneytressler on 4/17/17.
 */

public class FragmentBeatleBargains extends Fragment implements BeatleBargainsView {
  @Inject protected BeatleBargainsPresenter presenter;
  @BindView(R.id.link_beatles_page) ImageView beatlesLink;

  @OnClick(R.id.link_beatles_page)
  public void beatlesLinkClicked() {
    presenter.beatlesLinkClicked();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_beatle_bargains, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentBeatleBargains newInstance() {
     Bundle args = new Bundle();
     FragmentBeatleBargains fragment = new FragmentBeatleBargains();
    fragment.setArguments(args);
    return fragment;
  }

  /** Opens up Beatles WebPage on Device */

  @Override public void launchBeatlesPage() {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW,
        Uri.parse("https://travis40508.github.io/travis-teky-week3-projects/beatlePage/store_main.html"));
    startActivity(browserIntent);
  }
}
