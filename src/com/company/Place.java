package com.company;

import java.util.ArrayList;
import java.util.List;

public class Place implements CaveSite{
    private String description;

    private CaveSite[] side = new CaveSite[4];

    Place(){
        side[0] = new Wall_Space();
        side[1] = new Wall_Space();
        side[2] = new Wall_Space();
        side[3] = new Wall_Space();
    }

    public void setDesc(String d) {
        description = d;
    }

    public String getDesc(){
        return description;
    }

    public void setSide(int direction, Place exit) {
        side[direction] = exit;
    }

    public void enter(Player p) {
        p.setLoc(this);
    }

    public void exit(int direction, Player p) {
        side[direction].enter(p);
    }

}
