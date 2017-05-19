package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  private Button btn;
  private TextView tvTitle;
  private TextView tvDark;
  private TextView tvLight;
  private TextView tvPrimary;
  private Random rand = new Random();
  int randTheme = rand.nextInt(18);

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvTitle = (TextView) findViewById(R.id.greetingText);
    tvPrimary = (TextView) findViewById(R.id.primaryText);
    tvDark = (TextView) findViewById(R.id.darkText);
    tvLight = (TextView) findViewById(R.id.lightText);

    btn = (Button) findViewById(R.id.changeButton);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int randTheme = rand.nextInt(18);
        MainActivity.this.recreate();
      }
    });

    setColors();
  }

  private void setColors() {
    switch(randTheme) {
      case 0:
        tvTitle.setText("Lime Theme");
        tvDark.setText("Dark: #AFB42B");
        tvPrimary.setText("Primary: #CDDC39");
        tvLight.setText("Light: #F0F4C3");
        break;
      case 1:
        tvTitle.setText("Deep Orange Theme");
        tvDark.setText("Dark: #E64A19");
        tvPrimary.setText("Primary: #FF5722");
        tvLight.setText("Light: #FFCCBC");
        break;
      case 2:
        tvTitle.setText("Yellow Theme");
        tvDark.setText("Dark: #FBC02D");
        tvPrimary.setText("Primary: #FFEB3B");
        tvLight.setText("Light: #FFF9C4");
        break;
      case 3:
        tvTitle.setText("Amber Theme");
        tvDark.setText("Dark: #FFA00");
        tvPrimary.setText("Primary: #FFC107");
        tvLight.setText("Light: #FFECB3");
        break;
      case 4:
        tvTitle.setText("Brown Theme");
        tvDark.setText("Dark: #5D4037");
        tvPrimary.setText("Primary: #795548");
        tvLight.setText("Light: #D7CCC8");
        break;
      case 5:
        tvTitle.setText("Grey Theme");
        tvDark.setText("Dark: #616161");
        tvPrimary.setText("Primary: #9E9E9E");
        tvLight.setText("Light: #F5F5F5");
        break;
      case 6:
        tvTitle.setText("Blue Grey Theme");
        tvDark.setText("Dark: #455A64");
        tvPrimary.setText("Primary: #607D8B");
        tvLight.setText("Light: #CFD8DC");
        break;
      case 7:
        tvTitle.setText("Light Blue Theme");
        tvDark.setText("Dark: #0288D1");
        tvPrimary.setText("Primary: #03A9F4");
        tvLight.setText("Light: #B3E5FC");
        break;
      case 8:
        tvTitle.setText("Blue Theme");
        tvDark.setText("Dark: #2196F3");
        tvPrimary.setText("Primary: #1976D2");
        tvLight.setText("Light: #BBDEFB");
        break;
      case 9:
        tvTitle.setText("Orange Theme");
        tvDark.setText("Dark: #F57C00");
        tvPrimary.setText("Primary: #FF9800");
        tvLight.setText("Light: #FFE0B2");
        break;
      case 10:
        tvTitle.setText("Indigo Theme");
        tvDark.setText("Dark: #303F9F");
        tvPrimary.setText("Primary: #3F51B5");
        tvLight.setText("Light: #C5CAE9");
        break;
      case 11:
        tvTitle.setText("Purple Theme");
        tvDark.setText("Dark: #7B1FA2");
        tvPrimary.setText("Primary: #9C27B0");
        tvLight.setText("Light: #E1BEE7");
        break;
      case 12:
        tvTitle.setText("Deep Purple Theme");
        tvDark.setText("Dark: #512DA8");
        tvPrimary.setText("Primary: #673AB7");
        tvLight.setText("Light: #D1C4E9");
        break;
      case 13:
        tvTitle.setText("Red Theme");
        tvDark.setText("Dark: #D32F2F");
        tvPrimary.setText("Primary: ");
        tvLight.setText("Light: #FFCDD2");
        break;
      case 14:
        tvTitle.setText("Pink Theme");
        tvDark.setText("Dark: #C2185B");
        tvPrimary.setText("Primary: #E91E63");
        tvLight.setText("Light: #F8BBD0");
        break;
      case 15:
        tvTitle.setText("Cyan Theme");
        tvDark.setText("Dark: #0097A7");
        tvPrimary.setText("Primary: #00BCD4");
        tvLight.setText("Light: #B2EBF2");
        break;
      case 16:
        tvTitle.setText("Teal Theme");
        tvDark.setText("Dark: #00796B");
        tvPrimary.setText("Primary: #009688");
        tvLight.setText("Light: #B2DFDB");
        break;
      case 17:
        tvTitle.setText("Green Theme");
        tvDark.setText("Dark: #388E3C");
        tvPrimary.setText("Primary: #4CAF50");
        tvLight.setText("Light: #C8E6C9");
        break;
      case 18:
        tvTitle.setText("Light Green Theme");
        tvDark.setText("Dark: #689F38");
        tvPrimary.setText("Primary: #8BC34A");
        tvLight.setText("Light: #DCEDC8");
        break;
      default:
        break;
    }
  }

  @Override
  public Resources.Theme getTheme() {
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
