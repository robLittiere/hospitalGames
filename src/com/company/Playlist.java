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









    public void printAllSongs(){
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("Song name : " + songs.get(i).getSongName());
            System.out.println(" Artist : " + songs.get(i).getAuthor());
            System.out.println("Duraiton : " + songs.get(i).getDuration());
        }
    }

    public static void printAllPlaylist() {
        for (int i = 0; i < Main.listePlaylist.size(); i++) {
            String playlistName = Main.listePlaylist.get(i).getPlaylistName();
            System.out.println(playlistName);
        }
    }

    public void deletePlaylist(){
        Main.listePlaylist.remove(this);
    }

    public void deleteSong(String songName){
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongName() == songName){
                songs.remove(songs.get(i));
            }
            else {
                System.out.println("Sorry this song cannot be replaced");
            }
        }
    }

    public void clearPlaylist(){
        songs.clear();
    }

    public void searchSong(String songName){
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getSongName() == songName){
                System.out.println("Yes this music is in your playlist, her index is : " + i);
            }
            else{
                System.out.println("This music is not in your playlist");
            }
        }
    }





}
