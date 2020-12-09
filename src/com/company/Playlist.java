package com.company;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String playlistName;
    private List<Song> songs;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        songs = new ArrayList<>();
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }

    public void addSongs(Song song){
        songs.add(song);
        System.out.println("Song added");
    }

    public static void printAllPlaylist() {
        for (int i = 0; i < Main.listePlaylist.size(); i++) {
            String playlistName = Main.listePlaylist.get(i).getPlaylistName();
            System.out.println(playlistName);
        }
    }




}
