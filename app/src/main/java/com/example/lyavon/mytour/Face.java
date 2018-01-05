package com.example.lyavon.mytour;

import com.example.lyavon.mytour.model.DirectionModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Lyavon on 05.01.2018.
 */
//AIzaSyAUNR-iZ2n1vxhzaBptwgdHvCzbL0SamLY -> key

//https://maps.googleapis.com/maps/api/directions/json?origin=&destination=&waypoints=optimize:true|&mode=driving
public interface Face {

    @GET("maps/api/directions/json")
    Call<DirectionModel> getData(@Query("origin") String originName,
                                 @Query("destination") String destinationName,
                                 @Query("mode") String modeName,
                                 @Query("waypoints")    String waypointsVal,
                                 @Query("key") String key);

}
