package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  private Button btnNext;
  private Button btnPrev;
  private TextView tvTitle;
  private TextView tvDark;
  private TextView tvLight;
  private TextView tvPrimary;
  private RelativeLayout mRelativeLayout;
  private Random rand = new Random();
  int thisTheme;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Intent newIntent = getIntent();
    thisTheme = newIntent.getIntExtra("THEME", 0);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tvTitle = (TextView) findViewById(R.id.greetingText);
    tvPrimary = (TextView) findViewById(R.id.primaryText);
    tvDark = (TextView) findViewById(R.id.darkText);
    tvLight = (TextView) findViewById(R.id.lightText);
    mRelativeLayout = (RelativeLayout) findViewById(R.id.mainLayout);

    btnNext = (Button) findViewById(R.id.nextButton);
    btnNext.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        if(thisTheme <18) {
          thisTheme++;
        } else {
          thisTheme =0;
        }
        intent.putExtra("THEME", thisTheme);
        startActivity(intent);
      }
    });

    btnPrev = (Button) findViewById(R.id.prevbutton);
    btnPrev.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        if(thisTheme > 0) {
          thisTheme--;
        } else {
          thisTheme = 18;
        }
        intent.putExtra("THEME", thisTheme);
        startActivity(intent);
      }
    });

    setColors();
  }

  private void setColors() {
    switch(thisTheme) {
      case 0:
        tvTitle.setText("Lime Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkLime));
        tvDark.setText("Dark: #AFB42B");
        tvPrimary.setText("Primary: #CDDC39");
        tvLight.setText("Light: #F0F4C3");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentLime));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLime));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLime));
        break;
      case 1:
        tvTitle.setText("Deep Orange Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkDeepOrange));
        tvDark.setText("Dark: #E64A19");
        tvPrimary.setText("Primary: #FF5722");
        tvLight.setText("Light: #FFCCBC");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentDeepOrange));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDeepOrange));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDeepOrange));
        break;
      case 2:
        tvTitle.setText("Yellow Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkYellow));
        tvDark.setText("Dark: #FBC02D");
        tvPrimary.setText("Primary: #FFEB3B");
        tvLight.setText("Light: #FFF9C4");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentYellow));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryYellow));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryYellow));
        break;
      case 3:
        tvTitle.setText("Amber Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkAmber));
        tvDark.setText("Dark: #FFA00");
        tvPrimary.setText("Primary: #FFC107");
        tvLight.setText("Light: #FFECB3");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentAmber));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryAmber));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryAmber));
        break;
      case 4:
        tvTitle.setText("Brown Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkBrown));
        tvDark.setText("Dark: #5D4037");
        tvPrimary.setText("Primary: #795548");
        tvLight.setText("Light: #D7CCC8");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentBrown));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBrown));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBrown));
        break;
      case 5:
        tvTitle.setText("Grey Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkGrey));
        tvDark.setText("Dark: #616161");
        tvPrimary.setText("Primary: #9E9E9E");
        tvLight.setText("Light: #F5F5F5");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentGrey));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryGrey));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryGrey));
        break;
      case 6:
        tvTitle.setText("Blue Grey Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkBlueGrey));
        tvDark.setText("Dark: #455A64");
        tvPrimary.setText("Primary: #607D8B");
        tvLight.setText("Light: #CFD8DC");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentBlueGrey));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBlueGrey));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBlueGrey));
        break;
      case 7:
        tvTitle.setText("Light Blue Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkLightBlue));
        tvDark.setText("Dark: #0288D1");
        tvPrimary.setText("Primary: #03A9F4");
        tvLight.setText("Light: #B3E5FC");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentLightBlue));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLightBlue));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLightBlue));
        break;
      case 8:
        tvTitle.setText("Blue Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkBlue));
        tvDark.setText("Dark: #2196F3");
        tvPrimary.setText("Primary: #1976D2");
        tvLight.setText("Light: #BBDEFB");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentBlue));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBlue));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryBlue));
        break;
      case 9:
        tvTitle.setText("Orange Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkOrange));
        tvDark.setText("Dark: #F57C00");
        tvPrimary.setText("Primary: #FF9800");
        tvLight.setText("Light: #FFE0B2");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentOrange));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryOrange));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryOrange));
        break;
      case 10:
        tvTitle.setText("Indigo Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkIndigo));
        tvDark.setText("Dark: #303F9F");
        tvPrimary.setText("Primary: #3F51B5");
        tvLight.setText("Light: #C5CAE9");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentIndigo));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryIndigo));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryIndigo));
        break;
      case 11:
        tvTitle.setText("Purple Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkPurple));
        tvDark.setText("Dark: #7B1FA2");
        tvPrimary.setText("Primary: #9C27B0");
        tvLight.setText("Light: #E1BEE7");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentPurple));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryPurple));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryPurple));
        break;
      case 12:
        tvTitle.setText("Deep Purple Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkDeepPurple));
        tvDark.setText("Dark: #512DA8");
        tvPrimary.setText("Primary: #673AB7");
        tvLight.setText("Light: #D1C4E9");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentDeepPurple));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDeepPurple));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDeepPurple));
        break;
      case 13:
        tvTitle.setText("Red Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkRed));
        tvDark.setText("Dark: #D32F2F");
        tvPrimary.setText("Primary: ");
        tvLight.setText("Light: #FFCDD2");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentRed));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryRed));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryRed));
        break;
      case 14:
        tvTitle.setText("Pink Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkPink));
        tvDark.setText("Dark: #C2185B");
        tvPrimary.setText("Primary: #E91E63");
        tvLight.setText("Light: #F8BBD0");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentPink));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryPink));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryPink));
        break;
      case 15:
        tvTitle.setText("Cyan Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkCyan));
        tvDark.setText("Dark: #0097A7");
        tvPrimary.setText("Primary: #00BCD4");
        tvLight.setText("Light: #B2EBF2");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentCyan));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryCyan));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryCyan));
        break;
      case 16:
        tvTitle.setText("Teal Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkTeal));
        tvDark.setText("Dark: #00796B");
        tvPrimary.setText("Primary: #009688");
        tvLight.setText("Light: #B2DFDB");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentTeal));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryTeal));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryTeal));
        break;
      case 17:
        tvTitle.setText("Green Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkGreen));
        tvDark.setText("Dark: #388E3C");
        tvPrimary.setText("Primary: #4CAF50");
        tvLight.setText("Light: #C8E6C9");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentGreen));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryGreen));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryGreen));
        break;
      case 18:
        tvTitle.setText("Light Green Theme");
        tvTitle.setTextColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryDarkLightGreen));
        tvDark.setText("Dark: #689F38");
        tvPrimary.setText("Primary: #8BC34A");
        tvLight.setText("Light: #DCEDC8");
        mRelativeLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorAccentLightGreen));
        btnNext.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLightGreen));
        btnPrev.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.colorPrimaryLightGreen));
        break;
      default:
        break;
    }
  }

  @Override
  public Resources.Theme getTheme() {
    Resources.Theme theme = super.getTheme();
    switch(thisTheme) {
      case 0:
        theme.applyStyle(R.style.LimeTheme, true);
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
