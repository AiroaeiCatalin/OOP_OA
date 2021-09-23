package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public abstract class Location {
    protected int x;
    protected int y;
    private final TripPlanner tripPlanner;

    public Location(int x, int y, TripPlanner tripPlanner) {
        this.x = x;
        this.y = y;
        this.tripPlanner = tripPlanner;
        tripPlanner.addNewLocation(this);
    }

    public City getClosestCity(){
        return (City) tripPlanner.getLocations().stream().
                filter(location -> location instanceof City).filter(location -> location != this).
                min(Comparator.comparing(this::distanceBetweenTwoCities)).orElseThrow(NoSuchElementException::new);


    }

    public Double distanceBetweenTwoCities(Location location) {
       return Math.sqrt((location.getY() - this.getY()) * (location.getY() - this.getY()) + (location.getX() - this.getX()) * (location.getX() - this.getX()));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
