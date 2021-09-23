package com.company;

import java.util.ArrayList;
import java.util.List;

public class TripPlanner {
    private List<Location> locations;

    public TripPlanner() {
        locations = new ArrayList<Location>();
    }

    public void addNewLocation(Location location){
        this.locations.add(location);
    }



    public List<Location> getLocations() {
        return locations;
    }
}
