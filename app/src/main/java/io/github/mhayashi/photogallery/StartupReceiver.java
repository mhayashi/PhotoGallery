package io.github.mhayashi.photogallery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by Masahiro Hayashi on 12/3/14.
 */
public class StartupReceiver extends BroadcastReceiver {
    private static final String TAG = "StartupReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "Received broadcast intent: " + intent.getAction());

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        boolean isOn = preferences.getBoolean(PollService.PREF_IS_ALARM_ON, false);
        PollService.setServiceAlarm(context, isOn);
    }
}
