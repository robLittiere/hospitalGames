package com.company;

import java.sql.SQLOutput;

public class Gameplay {

    public String direction;
    int placeNumber = 1;
    int directionNumber = 0;
    public String directionChoosed;
    public String quit;

    public void place (int placeNumber)
    {
        if (placeNumber == 1)
        {
            System.out.println("You find yourself on a abandonned road, on you right side, you see a brick building, with a little river by it's side.");
            System.out.println("On your left side, there is a small hill, on wich you can see almost nothing from where you are, but you'll sure get nice view up here.");
            System.out.println("Downwards, theres is a valley, where the river from the building seems to go.");
            System.out.println("Finally, a forest can be found on the north, but it's too dark for you to see something in it right nowx.");
        }
        else if (placeNumber == 2)
        {
            System.out.println("");
        }
    }
}