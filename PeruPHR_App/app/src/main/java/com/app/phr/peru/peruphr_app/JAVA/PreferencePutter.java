package com.app.phr.peru.peruphr_app.JAVA;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by chiyo on 2016-08-10.
 */
public class PreferencePutter {
    final static String PREF_FILE_NAME = "Peru_PHR";
    final static String PREF_ID = "PID";
    final static String PREF_PW = "pw";
    final static String PREF_KEY = "keyCD";
    final static String LOG_IN = "Log_in";
    final static String PATIENT_NAME = "pName";
    private SharedPreferences mPreferences;
    public PreferencePutter(SharedPreferences preferences){
        mPreferences = preferences;

    }
}
