package com.akirasolutions.Config;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.appcompat.R;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Ebuctop on 30/03/2018.
 */
public class ConfigScreen extends Activity{

    public ConfigScreen(){

    }

    //Metodo encargado de establecer la configuración de la pantalla
    public void setConfig(Context context, int layout){
        //forzamos orientacion vertical
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //Sin barra de titulo
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(layout);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(ContextCompat.getColor(context, R.color.black));
        }
    }
}
