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
