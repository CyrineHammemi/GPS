package com.example.cyrinehammmi.gps;

/**
 * Created by Cyrine Hammémi on 30/01/2018.
 */

public class userModel {
    private String UserID;
    private double Latitude;
    private double atitude;

    public userModel() {
    }

    public userModel(String userID, double latitude, double atitude) {
        UserID = userID;
        Latitude = latitude;
        this.atitude = atitude;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public double getLatitude() {
        return Latitude;
    }

    public void setLatitude(double latitude) {
        Latitude = latitude;
    }

    public double getAtitude() {
        return atitude;
    }

    public void setAtitude(double atitude) {
        this.atitude = atitude;
    }
}
