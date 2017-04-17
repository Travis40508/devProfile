package com.example.rodneytressler.devprofile.Views.ContactScreen;

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
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class FragmentContact extends Fragment implements ContactView{

  @Inject protected ContactPresenter presenter;

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_contact, container, false);
    ButterKnife.bind(this, view);
    presenter.setView(this);
    return view;
  }

  @Override public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((ApplicationClass)getActivity().getApplicationContext()).getComponent().inject(this);
  }

  public static FragmentContact newInstance() {
     Bundle args = new Bundle();
     FragmentContact fragment = new FragmentContact();
    fragment.setArguments(args);
    return fragment;
  }

  @OnClick({R.id.image_phone, R.id.image_email, R.id.image_linkedin})
  public void onClick(View view) {
    switch(view.getId()) {
      case R.id.image_phone :
        presenter.phoneClicked();
        break;
      case R.id.image_email :
        presenter.emailClicked();
        break;
      case R.id.image_linkedin :
        presenter.linkedInClicked();
        break;
    }
  }

  @Override public void callNumber() {
    Intent intent = new Intent(Intent.ACTION_DIAL);
    intent.setData(Uri.parse("tel:6065482251"));
    startActivity(intent);
  }

  @Override public void sendEmail() {

  }

  @Override public void openLinkedIn() {

  }
}
