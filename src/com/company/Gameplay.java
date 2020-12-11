package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gameplay {
    private Place entrance;

    public Place createGame() {

        //Place n°1
        Place road = new Place();
        road.setDesc("You find yourself on a abandonned road, wich looks like no ones has been on it for a long decade..\n" +
                "On your east side, you see a huge, but heavily delapitaded brick building, to the north, a forest too dark to see anything inside\n" +
                "In the southern direction, there is just a valley, with a little river, that come from near the building, you don't actually see the lower point of the valley from where you are\n" +
                "Finally, on your west side, a hill. You could surly climb it, but going down by this same way is probably dangerous, as there are quit a lot of spiky stones in the way.");

        //Place n°2:
        Place hill = new Place();
        hill.setDesc("You finally make it to the top of the hill, catch your breath, and take a look at the view of what seems to be your city. You try to remember why it looks like the end of mankind.. but something interrupts you thoughts...\n" +
                "A shadow come from the south, you can not clearly see it shape, don't even know if it looks human, but you can feel how aggressive it is\n" +
                "You distinguish something in a knife shape, and finally make you mind : you have to run as fast as you can, and the only way is.. in the forest, to the north.");

        //Place n°3:
        Place building = new Place();
        building.setDesc("You decided to enter this building, even if it does not looks safe and at all..\n" +
                "While you walk towards it, you notice that the river aside you path, slowly turns red.\n" +
                "What a surpise, when you finally push the front door : a dead body, with it's head chopped off, lies here in a pool of blood..\n" +
                "You have never been that scared, and the only thing you can do now is run away in the opposite direction.");

        //Place n°4:
        Place valley = new Place();
        valley.setDesc("Once you walked down the valley, you fell off a little cliff and you find yourself stuck, and you can not go back to the north.\n" +
                "On your side is the river you saw earlier, and in a little pound made by this so called river, you see someone..\n" +
                "Someone dead. A dead body is floating right beside you. Your fear make you get up, and run to the west.");

        //Place n°5:
        Place forest = new Place();
        forest.setDesc("Once you entered the forest, you absolutely loose yourself inside it, and the only way to go back seems to be the south\n" +
                "But you are afraid, you don't know what happened to your city and..\n" +
                "What are thoses screams you actually hear?");

        road.setSide(0,forest);
        forest.setSide(1,road);
        road.setSide(1,valley);
        valley.setSide(0,road);
        road.setSide(2,building);
        building.setSide(3,road);
        road.setSide(3,hill);
        valley.setSide(3,hill);
        hill.setSide(0,forest);

        //Now return the entrance:
        entrance = road;
        return entrance;

    }
}