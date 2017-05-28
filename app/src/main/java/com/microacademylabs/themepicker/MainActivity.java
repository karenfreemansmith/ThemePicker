package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.WindowDecorActionBar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
  private Button btnNext;
  private Button btnPrev;
  private FloatingActionButton fabAccent;
  private TextView tvTitle;
  private TextView tvDark;
  private TextView tvLight;
  private TextView tvPrimary;
  private TextView tvAccent;
  private int mAccent;

  int thisTheme;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Intent newIntent = getIntent();
    thisTheme = newIntent.getIntExtra("THEME", 0);

    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mAccent = thisTheme;

    tvTitle = (TextView) findViewById(R.id.greetingText);
    tvPrimary = (TextView) findViewById(R.id.primaryText);
    tvAccent = (TextView) findViewById(R.id.accentText);
    tvDark = (TextView) findViewById(R.id.darkText);
    tvLight = (TextView) findViewById(R.id.lightText);
    fabAccent = (FloatingActionButton) findViewById(R.id.fabAccent);
    fabAccent.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        if(mAccent <18) {
          mAccent++;
        } else {
          mAccent =0;
        }
        changeAccent(mAccent);
      }
    });

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
        newColors("#F5F5F5", "#616161", "#9E9E9E", "#9E9E9E", "Grey Theme");
        break;
      case 1:
        newColors("#F8BBD0", "#C2185B", "#E91E63", "#FF4081", "Pink Theme");
        break;
      case 2:
        newColors("#B2EBF2", "#0097A7", "#00BCD4", "#00BCD4", "Cyan Theme");
        break;
      case 3:
        newColors("#FFECB3", "#FFA000", "#FFC107", "#FFC107", "Amber Theme");
        break;
      case 4:
        newColors("#C8E6C9", "#388E3C", "#4CAF50", "#4CAF50", "Green Theme");
        break;
      case 5:
        newColors("#D7CCC8", "#5D4037", "#795548", "#795548", "Brown Theme");
        break;
      case 6:
        newColors("#F0F4C3", "#AFB42B", "#CDDC39", "#CDDC39", "Lime Theme");
        break;
      case 7:
        newColors("#E1BEE7", "#7B1FA2", "#9C27B0", "#E040FB", "Purple Theme");
        break;
      case 8:
        newColors("#B3E5FC", "#0288D1", "#03A9F4", "#03A9F4", "Light Blue Theme");
        break;
      case 9:
        newColors("#FFF9C4", "#FBC02D", "#FFEB3B", "#FFEB3B", "Yellow Theme");
        break;
      case 10:
        newColors("#C5CAE9", "#303F9F", "#3F51B5", "#536DFE", "Indigo Theme");
        break;
      case 11:
        newColors("#FFCCBC", "#E64A19", "#FF5722", "#FF5722", "Deep Orange Theme");
        break;
      case 12:
        newColors("#BBDEFB", "#2196F3", "#1976D2", "#448AFF", "Blue Theme");
        break;
      case 13:
        newColors("#DCEDC8", "#689F38", "#8BC34A", "#8BC34A", "Light Green Theme");
        break;
      case 14:
        newColors("#D1C4E9", "#512DA8", "#673AB7", "#7C4DFF", "Deep Purple Theme");
        break;
      case 15:
        newColors("#FFE0B2", "#F57C00", "#FF9800", "#FF9800", "Orange Theme");
        break;
      case 16:
        newColors("#B2DFDB", "#00796B", "#009688", "#009688", "Teal Theme");
        break;
      case 17:
        newColors("#CFD8DC", "#455A64", "#607D8B", "#607D8B", "Blue Grey Theme");
        break;
      case 18:
        newColors("#FFCDD2", "#D32F2F", "#F44336", "#FF5252", "Red Theme");
        break;
      default:
        break;
    }
  }

  private void changeAccent(int c) {
    String[]accentColor = new String[] {
        "#9E9E9E", "#FF4081", "#00BCD4", "#FFC107", "#4CAF50", "#795548",
        "#CDDC39", "#E040FB", "#03A9F4", "#FFEB3B", "#536DFE", "#FF5722",
        "#448AFF", "#8BC34A", "#7C4DFF", "#FF9800", "#009688", "#607D8B", "#FF5252"
    };
    fabAccent.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(accentColor[c])));
    tvAccent.setText("Accent: " + accentColor[c]);
    tvAccent.setTextColor(Color.parseColor(accentColor[c]));
  }

  private void newColors(String light, String dark, String primary, String accent, String themeName) {
    tvTitle.setText(themeName);
    tvTitle.setTextColor(Color.parseColor(dark));
    tvTitle.setBackgroundColor(Color.parseColor(light));
    tvDark.setText("Dark: " + dark);
    tvDark.setTextColor(Color.parseColor(dark));
    tvPrimary.setText("Primary: " + primary);
    tvPrimary.setTextColor(Color.parseColor(primary));
    fabAccent.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(accent)));
    tvAccent.setText("Accent: " + accent);
    tvAccent.setTextColor(Color.parseColor(accent));
    tvLight.setText("Light: " + light);
    tvLight.setTextColor(Color.parseColor(light));
    tvLight.setBackgroundColor(Color.parseColor(dark));

    btnNext.setBackgroundColor(Color.parseColor(dark));
    btnPrev.setBackgroundColor(Color.parseColor(dark));

    // FAILED EFFORTS TO CHANGE THEME DYNAMICALLY...
    //    fabAccent.setBackgroundColor(Color.parseColor(accent));//not working, theme seems to over-ride this setting
    //    fabAccent.setBackgroundDrawable(new ColorDrawable(Color.parseColor(accent)));
    //    getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(primary)));
    //    getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(dark)));
    //    getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor(dark)));
  }

  @Override
  public Resources.Theme getTheme() {
    Resources.Theme theme = super.getTheme();
    switch(thisTheme) {
      case 0:
        theme.applyStyle(R.style.GreyTheme, true);
        break;
      case 1:
        theme.applyStyle(R.style.PinkTheme, true);
        break;
      case 2:
        theme.applyStyle(R.style.CyanTheme, true);
        break;
      case 3:
        theme.applyStyle(R.style.AmberTheme, true);
        break;
      case 4:
        theme.applyStyle(R.style.GreenTheme, true);
        break;
      case 5:
        theme.applyStyle(R.style.BrownTheme, true);
        break;
      case 6:
        theme.applyStyle(R.style.LimeTheme, true);
        break;
      case 7:
        theme.applyStyle(R.style.PurpleTheme, true);
        break;
      case 8:
        theme.applyStyle(R.style.LightBlueTheme, true);
        break;
      case 9:
        theme.applyStyle(R.style.YellowTheme, true);
        break;
      case 10:
        theme.applyStyle(R.style.IndigoTheme, true);
        break;
      case 11:
        theme.applyStyle(R.style.DeepOrangeTheme, true);
        break;
      case 12:
        theme.applyStyle(R.style.BlueTheme, true);
        break;
      case 13:
        theme.applyStyle(R.style.LightGreenTheme, true);
        break;
      case 14:
        theme.applyStyle(R.style.DeepPurpleTheme, true);
        break;
      case 15:
        theme.applyStyle(R.style.OrangeTheme, true);
        break;
      case 16:
        theme.applyStyle(R.style.TealTheme, true);
        break;
      case 17:
        theme.applyStyle(R.style.BlueGreyTheme, true);
        break;
      case 18:
        theme.applyStyle(R.style.RedTheme, true);
        break;
      default:
        break;
    }
    return theme;
  }
}
