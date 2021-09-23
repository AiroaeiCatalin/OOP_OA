package com.company;

public class Landmark extends Location{
    private String name;
    private int entranceFee;
    private LandmarkType landmarkType;

    public Landmark(int x, int y, TripPlanner tripPlanner, String name, int entranceFee, LandmarkType landmarkType) {
        super(x, y, tripPlanner);
        this.name = name;
        this.entranceFee = entranceFee;
        this.landmarkType = landmarkType;
    }

    public void setEntranceFee(int entranceFee) {
        this.entranceFee = entranceFee;
    }

}
