package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String menu = "m";

    public static List<Playlist> listePlaylist = new ArrayList<>();


    public static void main(String[] args) {


        while (menu != "q"){
            menu = Menu.LaunchGame(menu);
        }






        /*
        Scanner sc = new Scanner(System.in);
        String playlistName = sc.next();
        Playlist playlist1 = new Playlist(playlistName);

        System.out.println("Please indicate the name of the song");
        String songName = sc.next();

        System.out.println("Please indicate the author of the song");
        String songAuthor = sc.next();

        System.out.println("Please indicate the duration of the song");
        String songDuration = sc.next();

        Song song = new Song(songAuthor, songName, songDuration);
        playlist1.addSongs(song);

        for (int i = 0; i < playlist1.getSongs().size(); i++) {
            System.out.println(playlist1.getSongs().get(i).getSongName() + " de "  + playlist1.getSongs().get(i).getAuthor() + " dure  " + playlist1.getSongs().get(i).getDuration() );
        }

         */


    }
}
