package com.company;

import java.util.*;

public class Playlist implements List<Song> {
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
            System.out.println((i + 1) +  " : ");
            System.out.println("Song name : " + songs.get(i).getSongName());
            System.out.println("Artist : " + songs.get(i).getAuthor());
            System.out.println("Duration : " + songs.get(i).getDuration());
            System.out.println();
        }
    }
    public void printCurrentSong(int indexSong){
        System.out.println("Now playing : ");
        System.out.println("Song name : " + songs.get(indexSong).getSongName());
        System.out.println("Artist : " + songs.get(indexSong).getAuthor());
        System.out.println("Duration : " + songs.get(indexSong).getDuration());

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



    public boolean deleteSong(String songName){
        boolean songDeleted = false;
        if (searchSong(songName) == true){
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).getSongName().equals(songName)){
                    songs.remove(songs.get(i));
                    songDeleted = true;

                }
            }
        }
        return songDeleted;
    }

    public void clearPlaylist(){
        songs.clear();

    }

    public boolean searchSong(String songName){
        boolean songExist = false;
        for (int i = 0; i < songs.size(); i++) {

            if(songs.get(i).getSongName().equals(songName)){
                songExist = true;

            }
        }
        return songExist;
    }

    public static Playlist findPlaylist(String playlistName) {
        while (true){
            for (int i = 0; i < Main.listePlaylist.size(); i++) {
                if (Main.listePlaylist.get(i).getPlaylistName().equals(playlistName)) {
                    Playlist playlist = Main.listePlaylist.get(i);
                    return playlist;


                }
            }
            System.out.println("Your playlist was not found please retry");

        }

    }



    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Song> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Song song) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Song> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Song> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Song get(int index) {
        return null;
    }

    @Override
    public Song set(int index, Song element) {
        return null;
    }

    @Override
    public void add(int index, Song element) {

    }

    @Override
    public Song remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Song> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Song> listIterator(int index) {
        return null;
    }

    @Override
    public List<Song> subList(int fromIndex, int toIndex) {
        return null;
    }
}
