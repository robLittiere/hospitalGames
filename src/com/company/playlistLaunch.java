package com.company;

import java.util.ArrayList;
import java.util.List;
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
                        System.out.println("You can write --add-- to add a song to your playlist or write --quit-- to go back to the main menu");

                        String userInput = Menu.scanEntry();
                        if(userInput.equals("quit") || userInput.equals("q")){
                            menu = "m";
                            break;
                        }

                        else if (userInput.equals("enter") || userInput.equals("e")){
                            System.out.println("Alrighty, write the name of the song you want to add");
                            String songName = Menu.scanEntry();
                            System.out.println("Now, write which artist made the song");
                            String songArtist = Menu.scanEntry();
                            System.out.println("Finally, write the duration in seconds of the song");
                            String songDuration = Menu.scanEntry();
                            Song song = new Song(songArtist, songName, songDuration);
                            playlist1.addSongs(song);


                        }



                    }
                }


            }


        }








        return menu;
    }
}
