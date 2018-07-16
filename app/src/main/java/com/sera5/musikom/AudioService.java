package com.sera5.musikom;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.os.PowerManager;

import com.un4seen.bass.BASS;

public class AudioService extends Service {

    //media player
    private MediaPlayer player;
    private BASS bassplayer;
    //song list
    //private ArrayList<Song> songs;
    //current position
    private int songPosn;

    @Override
    public IBinder onBind(Intent arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public void onCreate() {
        super.onCreate();
        songPosn = 0;
        player = new MediaPlayer();
        bassplayer = new BASS();
    }

    public void initMusicPlayer() {
        player.setWakeMode(getApplicationContext(),
                PowerManager.PARTIAL_WAKE_LOCK);
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);
    }
}
