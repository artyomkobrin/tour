package com.example.lyavon.mytour.data;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Lyavon on 05.01.2018.
 */

public class RequestDataQuery implements Parcelable {

    private String originName;
    private String destinationName;
    private String waypointsName;
    private String modeName;

    public RequestDataQuery(String origin, String destination, String waypoints, String mode) {
        originName = origin;
        destinationName = destination;
        waypointsName = waypoints;
        modeName = mode;
    }

    public RequestDataQuery(Parcel in) {
        String[] data = new String[4];
        in.readStringArray(data);
        originName = data[0];
        destinationName = data[1];
        waypointsName = data[2];
        modeName = data[3];
    }

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationname(String destinationname) {
        this.destinationName = destinationname;
    }

    public String getWaypointsName() {
        return waypointsName;
    }

    public void setWaypointsName(String waypointsName) {
        this.waypointsName = waypointsName;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }


    @Override
    public int describeContents() {
        return 0;
    }


    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{originName, destinationName, waypointsName, modeName});
    }

    public static final Creator<RequestDataQuery> CREATOR = new Creator<RequestDataQuery>() {
        @Override
        public RequestDataQuery createFromParcel(Parcel source) {
            return new RequestDataQuery(source);
        }

        @Override
        public RequestDataQuery[] newArray(int size) {
            return new RequestDataQuery[size];
        }
    };
}
