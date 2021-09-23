package com.company;

public class City extends Location{
    private String name;

    public City(int x, int y, TripPlanner tripPlanner, String name) {
        super(x, y, tripPlanner);
        this.name = name;
    }

}
