package com.dev.rodneytressler.devprofile.Views.Header;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.dev.rodneytressler.devprofile.Di.ApplicationClass;
import com.dev.rodneytressler.devprofile.R;
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
  @BindView(R.id.header) RelativeLayout header;
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

  /** Sets About icon to selected, based on state of app. */

  @Override public void setAboutSelected() {
    aboutIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_about_selected));
  }

  /** Unselects all other icons that aren't selected. */

  @Override public void unSelectAllIcons() {
    aboutIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_about_unselected));
    androidIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_android_unselected));
    webIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_web_unselected));
    contactIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_contact_unselected));
  }

  /** Sets Android icon to selected based on state of app. */

  @Override public void setAndroidSelected() {
    androidIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_android_selected));
  }

  /** Sets Web icon to selected based on state of app. */

  @Override public void setWebSelected() {
    webIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_web_selected));
  }

  /** Sets Contact icon to selected based on state of app. */

  @Override public void setContactSelected() {
    contactIcon.setImageDrawable(getResources().getDrawable(R.drawable.ic_contact_selected));
  }

  /** Sets state of app based on button-click so that main presenter, which is listening to
   * state of app can behave appropriately. */

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
