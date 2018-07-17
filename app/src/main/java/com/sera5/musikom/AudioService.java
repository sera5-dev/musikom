package com.sera5.musikom;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.un4seen.bass.BASS;

import java.io.File;

public class AudioService extends Service {

    //media player
    private BASS bassplayer;
    //song list
    //private ArrayList<Song> songs;
    //current position
    private int songPosn;
    private IBinder mBinder;
    private String plugins;

    @Override
    public IBinder onBind(Intent arg0) {
        return mBinder;
    }

    public void onCreate() {
        super.onCreate();
        songPosn = 0;

        if (!BASS.BASS_Init(-1, 48000, 0)) {
            return;
        }

        plugins = "";
        String path = getApplicationInfo().nativeLibraryDir;
        String[] list = new File(path).list();

        for (String s : list) {
            int plug = BASS.BASS_PluginLoad(path + "/" + s, 0);
            if (plug != 0) { // plugin loaded...
                plugins += s + "\n"; // add it to the list
            }
        }
        if (plugins.equals("")) plugins = "no plugins - visit the BASS webpage to get some\n";

        BASS.BASS_SetConfig(BASS.BASS_CONFIG_BUFFER, 1000);
    }
}
