package com.example.pokethello;

//N'oubliez pas de déclarer le bon package dans lequel se trouve le fichier !

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
private TextView test = null;

@Override
public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
      
  test = new TextView(this);
  test.setText("<====3  <====3");
  setContentView(test);
}

}