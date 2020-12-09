package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class playlistLaunch {



    public static String  playlistLaunch(String menu){
        while(true){
            System.out.println("Hi this is where you manage and listen to your playlist");
            System.out.println("Press --Enter-- to start listening to music");
            System.out.println("You can write --quit-- or --q-- to go back to the main menu if you want to");
            String choice = Menu.scanEntry();
            if (choice.equals("quit") || choice.equals("q")) {
                menu = "m";
                break;
            }
            else if(choice.toLowerCase().equals("enter") || choice.equals("e")){
                while(true) {
                    if (Main.listePlaylist.isEmpty()) {
                        System.out.println("I can see you currently have no playlist registered, let's create one !");
                        System.out.println();
                        System.out.println("Enter the name of your first playlist ");
                        String playlistName = Menu.scanEntry();
                        Playlist playlist1 = new Playlist(playlistName);

                        //Add playlist to the list of playlist
                        Main.listePlaylist.add(playlist1);
                        System.out.println("You can write --add-- to add a song to your playlist or write --quit-- to go back to the main menu");

                        String userInput = Menu.scanEntry();
                        if(userInput.equals("quit") || userInput.equals("q")){
                            menu = "m";
                            break;
                        }

                        else if (userInput.equals("add") || userInput.equals("a")){
                            Song song = Song.createSong();
                            playlist1.addSongs(song);

                        }
                    }

                    else{
                        System.out.println("Here are your playlists");
                        Playlist.printAllPlaylist();


                        System.out.println();
                        System.out.println();
                        System.out.println("Enter --play-- to listen to one your playlists");
                        System.out.println("Enter --manage-- to start managing your playlists");
                        System.out.println("Enter --quit-- to go back to the main menu");

                        choice = Menu.scanEntry();

                        if (choice.equals("quit") || choice.equals("q")) {
                            menu = "m";
                            break;
                        }
                        else if (choice.equals("play") || choice.equals("p")) {
                                //Start playing a song
                                play();

                            }
                        else if (choice.equals("manage") || choice.equals("m")) {
                            //Start managing playlists


                        }
                        break;
                    }
                    break;
                }


            }
            break;


        }








        return menu;
    }

    public static void play() {
        List<Song> playlist = null;

        Scanner scanner= new Scanner(System.in);


        while (true){
            System.out.println();
            System.out.println("Write the name of the playlist you want to listen");
            String playlistName = scanner.next();
            boolean playlistExist = false;

            for (int i = 0; i < Main.listePlaylist.size(); i++) {
                if (Main.listePlaylist.get(i).getPlaylistName().equals(playlistName)){
                    playlistExist = true;
                    playlist = Main.listePlaylist.get(i);
                    break;
                } else {
                    playlistExist = false;
                }
            }
            if (playlistExist == true){
                break;
            }  else {
                System.out.println("This playlist do not exist");
            }
        }

        System.out.println("Write --Order-- to listen the playlist in order");
        System.out.println("Write --Random-- to listen the playlist in a random order");
        String userInput = scanner.next();
        boolean forward = true;
        boolean isQuit = false;

        if (playlist.isEmpty()){
            System.out.println("No song in this playlist");
            return;
        }
        else if (userInput.toLowerCase().equals("order") || userInput.toLowerCase().equals("o")){
            System.out.println("Now playing " );

        } else if (userInput.toLowerCase().equals("random") || userInput.toLowerCase().equals("r")){
            int indexSong = randomSong(playlist);
            System.out.println("Now playing " );
        }
    }

    private static int randomSong(List<Song> playlist) {
        double d =Math.random();
        int n = (int)d;

        n = (int)(Math.random() * playlist.size());
        return n ;
    }
}
