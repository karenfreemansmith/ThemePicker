package com.microacademylabs.themepicker;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
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
  private FloatingActionButton fabAccent;
  private TextView tvTitle;
  private TextView tvDark;
  private TextView tvLight;
  private TextView tvPrimary;

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
    fabAccent = (FloatingActionButton) findViewById(R.id.fabAccent);

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
        newColors("#F5F5F5", "#616161", "#9E9E9E", "#9E9E9E", "Pink Theme");
        break;
      case 1:
        newColors("#F8BBD0", "#C2185B", "#E91E63", "#E91E63", "Pink Theme");
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
        newColors("#E1BEE7", "#7B1FA2", "#9C27B0", "#9C27B0", "Purple Theme");
        break;
      case 8:
        newColors("#B3E5FC", "#0288D1", "#03A9F4", "#03A9F4", "Light Blue Theme");
        break;
      case 9:
        newColors("#FFF9C4", "#FBC02D", "#FFEB3B", "#FFEB3B", "Yellow Theme");
        break;
      case 10:
        newColors("#C5CAE9", "#303F9F", "#3F51B5", "#3F51B5", "Indigo Theme");
        break;
      case 11:
        newColors("#FFCCBC", "#E64A19", "#FF5722", "#FF5722", "Deep Orange Theme");
        break;
      case 12:
        newColors("#BBDEFB", "#2196F3", "#1976D2", "#1976D2", "Blue Theme");
        break;
      case 13:
        newColors("#DCEDC8", "#689F38", "#8BC34A", "#8BC34A", "Light Green Theme");
        break;
      case 14:
        newColors("#D1C4E9", "#512DA8", "#673AB7", "#673AB7", "Deep Purple Theme");
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
        newColors("#FFCDD2", "#D32F2F", "#F44336", "#F44336", "Red Theme");
        break;
      default:
        break;
    }
  }

  private void newColors(String light, String dark, String primary, String accent, String themeName) {
    tvTitle.setText(themeName);
    super.getTheme().applyStyle(R.style.GreyTheme, true);
    tvDark.setText("Dark: " + dark);
    tvTitle.setTextColor(Color.parseColor(dark));
    tvPrimary.setText("Primary: " + primary);
    tvLight.setText("Light: " + light);
    tvTitle.setBackgroundColor(Color.parseColor(light));
    fabAccent.setBackgroundColor(Color.parseColor(accent));
    btnNext.setBackgroundColor(Color.parseColor(accent));
    btnPrev.setBackgroundColor(Color.parseColor(accent));
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
