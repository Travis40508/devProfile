package com.example.rodneytressler.devprofile.Views.Header;

import android.content.Context;
import android.support.annotation.BinderThread;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;
import javax.inject.Inject;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class Header extends PercentRelativeLayout implements HeaderView {
  @Inject protected HeaderPresenter presenter;
  @BindView(R.id.icon_about_me) ImageView aboutIcon;
  @BindView(R.id.icon_android) ImageView androidIcon;
  @BindView(R.id.icon_web) ImageView webIcon;
  @BindView(R.id.icon_contact) ImageView contactIcon;
  public Header(Context context) {
    super(context);
    init(null);
  }

  public Header(Context context, AttributeSet attrs) {
    super(context, attrs);
    init(attrs);
  }

  public Header(Context context, AttributeSet attrs, int defStyle) {
    super(context, attrs, defStyle);
    init(attrs);
  }

  private void init(AttributeSet attrs) {
    View view = LayoutInflater.from(getContext()).inflate(R.layout.header, this, true);
    ButterKnife.bind(this, view);
    ((ApplicationClass) getContext().getApplicationContext()).getComponent()
        .inject(this);
    presenter.setView(this);
  }

  @Override public void setAboutSelected() {
    Log.d("@@@@", "you are a god...");
  }

  @OnClick({R.id.icon_about_me, R.id.icon_android, R.id.icon_web, R.id.icon_contact})
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.icon_about_me :
        presenter.buttonClicked("about");
        break;
      case R.id.icon_android :
        presenter.buttonClicked("android");
        break;
      case R.id.icon_web :
        presenter.buttonClicked("web");
        break;
      case R.id.icon_contact :
        presenter.buttonClicked("contact");
        break;
    }
  }
}
