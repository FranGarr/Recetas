package com.akirasolutions.Config;

import android.content.pm.PackageManager;

/**
 * Created by Ebuctop on 30/03/2018.
 */
public class Permisos {


    //Permisos
    private static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1 ;
    private static final int MY_PERMISSIONS_REQUEST_BLUETOOTH_ADMIN = 2 ;

    public Permisos(){

    }

    //Método encargado de obtener los permisos
    public static void getPermisos(int nPermiso){

        switch(nPermiso){
            case 0:
                break;


        }

    }

    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {

                }


            }
            break;
            case MY_PERMISSIONS_REQUEST_BLUETOOTH_ADMIN: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                } else {

                }


            }
            break;
        }
    }

}
