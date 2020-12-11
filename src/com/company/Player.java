package com.company;

public class Player {
    private Place myLoc;

    public void setPlace(Place p) {
        myLoc = p;
    }

    public void go(int direction) {
        myLoc.exit(direction,this);
    }

    public void setLoc(Place p) {
        myLoc = p;
    }

    public Place getLoc() {
        return myLoc;
    }
}
