package com.modzombies;

import android.util.Log;

/**
 * Created by josua.arnigo on 21/03/14.
 */
public class Utils {

    private static boolean mdebuglog = true;

    public static void logD(String TAG, String string) {
        if (mdebuglog) {
            Log.d(TAG, string);
        }

    }
}
