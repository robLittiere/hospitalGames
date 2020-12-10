package com.company;

import java.util.Scanner;

public class Menu {




    public static String LaunchGame(String menu){

        System.out.println("Welcome to Hospital Games");
        System.out.println();
        System.out.println("Here you will be able to play a game called proutprout and listen to music");
        System.out.println();
        System.out.println("Please Enter the word --Playlist-- or --Game-- in order to start an activity ");
        System.out.println();
        System.out.println("You can also press --quit-- to quit the app");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = sc.next();


        if (choice.toLowerCase().equals("playlist")|| choice.equals("p")  ){
            menu = playlistLaunch.playlistLaunch(menu);
            return menu;

        }

        else if (choice.toLowerCase().equals("game")|| choice.equals("g")){
            menu = Game.gameLaunch(menu);
            return menu;
        }


        else if (choice.toLowerCase().equals("quit")|| choice.equals("q")){
            menu = "q";
            return menu;
        }

        return menu;

    }


    public static String scanEntry(){
        Scanner sc = new Scanner(System.in);
        return sc.next();

    }
}
