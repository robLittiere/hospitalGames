package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gameplay {
    private Place entrance;

    public Place createGame() {


        //Place n°1
        Place road = new Place();
        road.setDesc("rororoo");

        //Place n°2:
        Place hill = new Place();
        hill.setDesc("ihhiihihi");

        //Place n°3:
        Place building = new Place();
        building.setDesc("bububuub");

        //Place n°4:
        Place valley = new Place();
        valley.setDesc("avavavvav");

        //Place n°5:
        Place forest = new Place();
        forest.setDesc("fofofoof");

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