package com.emiappnw.nerdweather;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog.Builder;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare view variables
        final TextView currentTemp = findViewById(R.id.currentTemp);
        ImageButton showStatsDialog = findViewById(R.id.showStatsDialog);

        //Do stuff (TEST)
        currentTemp.setText("TEMP");

        //Switch between C and F
        currentTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* TODO 1: Implement unit conversion and display */
            }
        });

        //Stats Dialog
        showStatsDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog statsDialog = new Builder(MainActivity.this)
                .setView(getLayoutInflater().inflate(R.layout.dialog_temp_stats, null)).create();
                statsDialog.getWindow().setBackgroundDrawableResource(R.color.transparent);
                statsDialog.getWindow().setDimAmount(0.0f);
                statsDialog.show();
            }
        });


    }

    //Inject Calligraphy into Context
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
