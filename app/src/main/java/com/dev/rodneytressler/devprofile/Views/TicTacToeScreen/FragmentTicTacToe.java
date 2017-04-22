package com.dev.rodneytressler.devprofile.Views.TicTacToeScreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.dev.rodneytressler.devprofile.Di.ApplicationClass;
import com.dev.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/17/17.
 */

public class FragmentTicTacToe extends Fragment implements TicTacToeView {
  @Inject protected TicTacToePresenter presenter;

  @OnClick(R.id.link_tictactoe_page)
  public void ticTacToeLinkClicked() {
    presenter.ticTacToeLinkClicked();
  }

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_tic_tac_toe, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentTicTacToe newInstance() {
     Bundle args = new Bundle();
     FragmentTicTacToe fragment = new FragmentTicTacToe();
    fragment.setArguments(args);
    return fragment;
  }

  /** Launches tictactoe website based on button click. */

  @Override public void launchTicTacToeSite() {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW,
        Uri.parse("https://travis40508.github.io/travis-teky-week3-projects/ticTacToe/ticTacToe.html"));
    startActivity(browserIntent);
  }
}
