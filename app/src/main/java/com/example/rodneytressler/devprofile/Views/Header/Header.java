package com.example.rodneytressler.devprofile.Views.Header;

import android.content.Context;
import android.support.percent.PercentRelativeLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import butterknife.ButterKnife;
import com.example.rodneytressler.devprofile.Di.ApplicationClass;
import com.example.rodneytressler.devprofile.R;

/**
 * Created by rodneytressler on 4/16/17.
 */

public class Header extends PercentRelativeLayout implements HeaderView {
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
  }
}
