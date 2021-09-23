package com.company;

import java.util.ArrayList;
import java.util.List;

public class UserLocation extends Location{
    private List<Integer> oldX;
    private List<Integer> oldY;

    public UserLocation(int x, int y, TripPlanner tripPlanner, List<Integer> oldX, List<Integer> oldY) {
        super(x, y, tripPlanner);
        this.oldX = oldX;
        this.oldY = oldY;
    }

    public void setX(int x) {
        this.oldX.add(this.getX());
        this.x = x;
    }

    public void setY(int y) {
        this.oldY.add(this.getY());
        this.y = y;
    }


}
