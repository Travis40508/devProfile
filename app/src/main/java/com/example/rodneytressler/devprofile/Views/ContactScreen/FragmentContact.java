package com.example.rodneytressler.devprofile.Views.ContactScreen;

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

public class FragmentContact extends Fragment implements ContactView{

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_contact, container, false);
    ButterKnife.bind(this, view);
    return view;
  }

  public static FragmentContact newInstance() {
     Bundle args = new Bundle();
     FragmentContact fragment = new FragmentContact();
    fragment.setArguments(args);
    return fragment;
  }
}
