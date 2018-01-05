package com.example.lyavon.mytour;

import com.example.lyavon.mytour.model.DirectionModel;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Lyavon on 05.01.2018.
 */

public class ParsJson  {

    DataQuery dataQuery = new DataQuery();

    ArrayList<Float> a1 = new ArrayList<>();
    ArrayList<Float> a2 = new ArrayList<>();

    public void ParsJson() {




        String origin = "Брест";
        String destination = "Берёза";
        String waypoints = "Кобрин|Жабинка";
        String mode = "driving";
        String key = "AIzaSyCfsjKcCw2wtTLz2LiozwO9R6ZuW9KL4qk";
        final String[] ss = {""};

        Retrofit retrofit;
        Face face;
        Gson gson = new GsonBuilder().create();
        String url = "https://maps.googleapis.com/";

        retrofit = new Retrofit.Builder()
                .baseUrl(url)//Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create(gson))//Конвертер, необходимый для преобразования JSON'а в объекты
                .build();


        face = retrofit.create(Face.class); //Создаем объект, при помощи которого будем выполнять запросы

        face.getData(origin,destination,waypoints).enqueue(new Callback<DirectionModel>() {
            @Override
            public void onResponse(Call<DirectionModel> call, Response<DirectionModel> response) {
                for (int rou = 0; rou < response.body().getRoutes().size(); rou++) {
                    for (int leg = 0; leg < response.body().getRoutes().get(rou).getLegs().size() - 1; leg++) {

                        for (int step = 0; step < response.body().getRoutes().get(rou).getLegs().get(leg).getSteps().size() - 1; step++) {

                            a1.add(response.body().getRoutes().get(rou).getLegs().get(leg).getSteps()
                                    .get(step).getStartLocation().getLat());
                            a2.add(response.body().getRoutes().get(rou).getLegs().get(leg).getSteps()
                                    .get(step).getStartLocation().getLng());
                        }
                    }
                }

                dataQuery.setStartLocLat(a1);
                dataQuery.setStartLocLng(a2);

            }

            @Override
            public void onFailure(Call<DirectionModel> call, Throwable t) {

            }
        });


    }


}
