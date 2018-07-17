package com.sera5.musikom;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends RecyclerView.Adapter<SongAdapter.Holder> {
    private Song[] sSongs;
    private List<Song> selectedSongs;

    public SongAdapter(Song[] songs) {
        sSongs = songs;

        selectedSongs = new ArrayList<>();
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_song, parent, false);

        Holder holder = new Holder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        //holder.imvSong.setImageResource(R.drawable.standardartwork);
        holder.txvSongTitle.setText(sSongs[position].getTitle());
        holder.txvSongInfo.setText(sSongs[position].getArtist());
    }

    @Override
    public int getItemCount() {
        return sSongs != null ? sSongs.length : 0;
    }

    public Song[] getSelectedSongs() {
        Song[] songs = new Song[selectedSongs.size()];

        return selectedSongs.toArray(songs);
    }

    public class Holder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        TextView txvSongTitle;
        TextView txvSongInfo;

        public Holder(View layout) {
            super(layout);

            linearLayout = (LinearLayout) layout;

            txvSongTitle = (TextView) layout.findViewById(R.id.song_title);
            txvSongInfo = (TextView) layout.findViewById(R.id.song_info);
        }
    }
}