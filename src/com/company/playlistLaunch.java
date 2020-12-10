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
        Playlist playlist = null;


        Scanner scanner= new Scanner(System.in);

        int indexSong = 0;



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
            playlist.printAllSongs();

            System.out.println("Write --Order-- to listen the playlist in order");
            System.out.println("Write --Random-- to listen the playlist in a random order");
            String userInput = scanner.next();
            boolean isQuit = false;
            boolean random = false;


            if (playlist.isEmpty()){
                System.out.println("No song in this playlist");
                return;
            }
            else if (userInput.toLowerCase().equals("order") || userInput.toLowerCase().equals("o")){
                random = false;
                indexSong = 0;
                playlist.printCurrentSong(indexSong);
                printMenuSong(random);

            } else if (userInput.toLowerCase().equals("random") || userInput.toLowerCase().equals("r")){
                random = true;
                indexSong = randomSong(playlist);
                playlist.printCurrentSong(indexSong);
                printMenuSong(random);
            }

            while (!isQuit){
                String choose = scanner.next();
                scanner.nextLine();

                if (choose.toLowerCase().equals("stop") || choose.toLowerCase().equals("s")){
                    System.out.println("Playlist is done");
                    isQuit = true;
                    break;
                }

                if (choose.toLowerCase().equals("next") || choose.toLowerCase().equals("n")){
                    if (random) {
                        indexSong = randomSong(playlist);
                        playlist.printCurrentSong(indexSong);
                    } else if (!random && indexSong < playlist.size() - 1){
                        indexSong++;
                        playlist.printCurrentSong(indexSong);
                    } else {
                        System.out.println("We have reached the end of the playlist");
                    }
                }


                if (choose.toLowerCase().equals("prev") || choose.toLowerCase().equals("p")){
                    if (random) {
                        indexSong = randomSong(playlist);
                        playlist.printCurrentSong(indexSong);
                    } else if (!random && indexSong > 0){
                        indexSong--;
                        playlist.printCurrentSong(indexSong);
                    } else{
                        System.out.println("We are at the start of the playlist");
                    }
                }

                if (choose.toLowerCase().equals("replay") || choose.toLowerCase().equals("r")){
                    playlist.printCurrentSong(indexSong);
                }

                if (choose.toLowerCase().equals("random")){
                    random = true;
                }

                if (choose.toLowerCase().equals("order") || choose.toLowerCase().equals("o")){
                    random = false;
                }
            }
        }

    private static void printMenuSong(boolean random) {
        System.out.println();
        System.out.println("What you can do now : ");
        if (!random){
            System.out.println("--Stop--- to stop\n" + "--Next to play next song\n" + "--Prev-- to play previous song\n" + "--Replay-- to replay the current song\n" + "--Random-- to pass to random order");
        }
        if (random){
            System.out.println("--Stop--- to stop\n" + "--Next to play next song\n" + "--Prev-- to play previous song\n" + "--Replay-- to replay the current song\n" + "--Order-- to pass to order");
        }
    }


    private static int randomSong(Playlist playlist) {
        double d =Math.random();
        int n = (int)d;

        n = (int)(Math.random() * playlist.size());
        return n ;
    }
}
