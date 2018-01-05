package com.example.lyavon.mytour;

import java.util.ArrayList;

/**
 * Created by Lyavon on 04.01.2018.
 */

public class DataQuery {

   private ArrayList<Float> startLocLat;
    private   ArrayList<Float> startLocLng;
    private  ArrayList<Float> endLocLat;
    private  ArrayList<Float> endLocLng;

    public ArrayList<Float> getStartLocLat() {
        return startLocLat;
    }

    public void setStartLocLat(ArrayList<Float> startLocLat) {
        this.startLocLat = startLocLat;
    }

    public ArrayList<Float> getStartLocLng() {
        return startLocLng;
    }

    public void setStartLocLng(ArrayList<Float> startLocLng) {
        this.startLocLng = startLocLng;
    }

    public ArrayList<Float> getEndLocLat() {
        return endLocLat;
    }

    public void setEndLocLat(ArrayList<Float> endLocLat) {
        this.endLocLat = endLocLat;
    }

    public ArrayList<Float> getEndLocLng() {
        return endLocLng;
    }

    public void setEndLocLng(ArrayList<Float> endLocLng) {
        this.endLocLng = endLocLng;
    }
}
