package com.sera5.musikom;

public class Song {
    public final int AUDIO_BITRATE = 1;
    public final int AUDIO_SAMPLE_RATE = 2;
    public final int AUDIO_DURATION = 3;
    public final int AUDIO_SIZE = 4;

    private String title, artist, album, year;
    private String[] audio_details = new String[16];

    public Song(String title, String artist, String album, String year) {
        title = this.title;
        artist = this.artist;
        album = this.album;
        year = this.year;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }

    public String getYear() {
        return year;
    }
}
