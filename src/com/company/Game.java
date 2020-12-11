package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

        private Gameplay theCave;
        private Player thePlayer;


    public static String gameLaunch(String menu) throws IOException {
        while (true) {
            System.out.println("|--------------------------------------------------------------|");
            System.out.println();
            System.out.println("Welcome to our interactive story game, called Collosal Cave");
            System.out.println("Please type the word --Play-- to begin a new game");
            System.out.println("Press --q-- to exit this page.");
            System.out.println();
            System.out.println("|---------------------------------------------------------------|");
            String choice = Menu.scanEntry();
            if (choice.equals("quit") || choice.equals("q"))
            {
                menu = "m";
                break;
            }
            else if(choice.toLowerCase().equals("play") || choice.equals("p")) {
                Game theGame = new Game();
                theGame.startGame();
                }
        }
        return menu;
    }

    private int convertDirection(String input) {
        char d = input.charAt(0);
        int theDirection = 9999;
        switch(d) {
            case 'n':case 'N': theDirection = 0;break;
            case 's':case 'S': theDirection = 1;break;
            case 'e':case 'E': theDirection = 2;break;
            case 'w':case 'W': theDirection = 3;break;
        }
        return theDirection;
    }

    public void startGame() throws IOException {
        Player thePlayer = new Player();
        Gameplay theCave = new Gameplay();
        Place startRm = theCave.createGame();
        thePlayer.setPlace(startRm);

        /** Create the keyboard to control the game */
        BufferedReader keyboard  = new BufferedReader(new InputStreamReader(System.in));

        String inputString = "prepare";

        /* The main query user, get command, interpret, execute cycle. */
        while (inputString.charAt(0)!='q') {
            /* get next move */
            int direction = 9;

            String description = thePlayer.getLoc().getDesc();
            System.out.println("|---------------------------------------------------------------------------------------|\n");
            System.out.println(description);
            System.out.println();
            System.out.println("Which way (n,s,e,w,)," +
                    " or quit(q)?" + '\n');
            System.out.println("|---------------------------------------------------------------------------------------|");
            inputString = keyboard.readLine();
            System.out.println('\n');

            if(inputString.equals("")) inputString = " ";
            char key = inputString.charAt(0);
            switch(key) {
                //Go
                case 'n':
                case 'N':
                case 's':
                case 'S':
                case 'e':
                case 'E':
                case 'w':
                case 'W':

                    direction = convertDirection(inputString);
                    thePlayer.go(direction);
                    break;
            }
        }
    }
}
