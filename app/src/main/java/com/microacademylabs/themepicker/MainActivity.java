package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

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
        MainActivity.this.recreate();
      }
    });
  }
  @Override
  public Resources.Theme getTheme() {
    Random rand = new Random();
    int randTheme = rand.nextInt(18);
    Resources.Theme theme = super.getTheme();
    switch(randTheme) {
      case 0:
        theme.applyStyle(R.style.OrangeTheme, true);
        break;
      case 1:
        theme.applyStyle(R.style.DeepOrangeTheme, true);
        break;
      case 2:
        theme.applyStyle(R.style.YellowTheme, true);
        break;
      case 3:
        theme.applyStyle(R.style.AmberTheme, true);
        break;
      case 4:
        theme.applyStyle(R.style.BrownTheme, true);
        break;
      case 5:
        theme.applyStyle(R.style.GreyTheme, true);
        break;
      case 6:
        theme.applyStyle(R.style.BlueGreyTheme, true);
        break;
      case 7:
        theme.applyStyle(R.style.LightBlueTheme, true);
        break;
      case 8:
        theme.applyStyle(R.style.BlueTheme, true);
        break;
      case 9:
        theme.applyStyle(R.style.OrangeTheme, true);
        break;
      case 10:
        theme.applyStyle(R.style.IndigoTheme, true);
        break;
      case 11:
        theme.applyStyle(R.style.PurpleTheme, true);
        break;
      case 12:
        theme.applyStyle(R.style.DeepPurpleTheme, true);
        break;
      case 13:
        theme.applyStyle(R.style.RedTheme, true);
        break;
      case 14:
        theme.applyStyle(R.style.PinkTheme, true);
        break;
      case 15:
        theme.applyStyle(R.style.CyanTheme, true);
        break;
      case 16:
        theme.applyStyle(R.style.TealTheme, true);
        break;
      case 17:
        theme.applyStyle(R.style.GreenTheme, true);
        break;
      case 18:
        theme.applyStyle(R.style.LightGreenTheme, true);
        break;
      default:
        break;
    }
    return theme;
  }
}
