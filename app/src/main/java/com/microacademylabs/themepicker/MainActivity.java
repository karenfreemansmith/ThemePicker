package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  private Button btn;
  private int myTheme;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


    btn = (Button) findViewById(R.id.changeButton);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
  }
  @Override
  public Resources.Theme getTheme() {
    Resources.Theme theme = super.getTheme();
    theme.applyStyle(R.style.AppTheme2, true);

    return theme;
  }
}
