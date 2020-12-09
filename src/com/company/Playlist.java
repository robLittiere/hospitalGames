package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playlistName;
    private List<Song> songs = new ArrayList<>();

    public Playlist(List<Song> songs, String playlistName) {
        this.playlistName = playlistName;
        this.songs = songs;

    }






    public List<Song> getSongs() {
        return songs;
    }

    public void printAllSongs() {
        songs.forEach(System.out::println);
    }



    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
