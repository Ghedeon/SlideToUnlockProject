package com.slidetounlock;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.slidetounlock.widget.R;
import com.slidetounlock.widget.SlideToUnlock;

public class MainActivity extends Activity implements SlideToUnlock.OnUnlockListener {

  private SlideToUnlock slideToUnlock;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    slideToUnlock = (SlideToUnlock) findViewById(R.id.slidetounlock);
    slideToUnlock.setOnUnlockListener(this);
  }


  @Override
  public void onUnlock() {
    Toast.makeText(this, "Unlocked", Toast.LENGTH_SHORT).show();
  }

}
