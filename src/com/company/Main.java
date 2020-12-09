package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> chansons = new ArrayList<>();
        chansons.add("la premier");
        chansons.add("la deuxieme");
        chansons.forEach(System.out::println);

        Song song1 = new Song("jul", "byebye", "250");
        Song song2 = new Song("jul", "byebye", "250");
        List<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        Playlist playlist1 = new Playlist(songs, "JUlbest");
        playlist1.printAllSongs();


        List<Song> playlistJul = new ArrayList<>();
        playlistJul.add(song1);
        playlistJul.add(song2);
        for (int i = 0; i < playlistJul.size(); i++) {
            System.out.println(playlistJul.get(i).getSongName() + " de "  + playlistJul.get(i).getAuthor() + " dure  " + playlistJul.get(i).getDuration() );
        }

h

    }
}
