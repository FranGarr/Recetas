package com.akirasolutions.Activities;
import android.app.Activity;


        import android.content.Context;
        import android.content.SharedPreferences;

        import android.os.Handler;

        import android.app.Activity;
        import android.content.Intent;
        import android.content.pm.ActivityInfo;
        import android.os.Bundle;


import com.akirasolutions.Config.ConfigScreen;
import com.akirasolutions.recetasshokugeki.R;

/**
 * Created by Ebuctop on 01/04/2018.
 */
public class SplashActivity extends Activity {


    // Establecemos la duracion del timer
    private static final int SPLASH_SCREEN_DELAY = 3000;
    Context context=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConfigScreen cfg = new ConfigScreen();
        cfg.setConfig(context, R.layout.splashinitial);
        cfg.setMain(context);

        SharedPreferences mode = getSharedPreferences("PREFERENCES", Context.MODE_PRIVATE);
        final int modo = mode.getInt("mode", 0);
        String version=mode.getString("VERSION","NULL");
        String language=mode.getString("IDIOMA","NULL");

        SharedPreferences.Editor editor = mode.edit();
        editor.putInt("mode", 1);
        editor.commit();


    }



}
