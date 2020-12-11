package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gameplay {
    private Place entrance;

    public Place createGame() {


        //Place n°1
        Place road = new Place();
        road.setDesc("");

        //Place n°2:
        Place hill = new Place();
        hill.setDesc("");

        //Place n°3:
        Place building = new Place();
        building.setDesc("");

        //Place n°4:
        Place valley = new Place();
        valley.setDesc("");

        //Place n°5:
        Place forest = new Place();
        forest.setDesc("");

        //Now return the entrance:
        entrance = road;
        return entrance;

    }
}