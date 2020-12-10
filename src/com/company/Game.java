package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Game
{
    public static String gameLaunch(String menu)
    {
        while (true)
        {
            System.out.println("Welcome to our interactive story game, called Collosal Cave");
            System.out.println("Please type the word --Play-- to begin a new game");
            System.out.println("You can also type the word --continue-- to continue an older game, or press --q-- to exit this page.");
            String choice = Menu.scanEntry();
            if (choice.equals("quit") || choice.equals("q"))
            {
                menu = "m";
                break;
            }
            else if(choice.toLowerCase().equals("play") || choice.equals("p"))
            {
                while (true)
                {
                    //Gameplay();
                }
            }
        }
        return menu;
    }
}
