package com.cusguss.fungimonitor.thingspeak;

import com.cusguss.fungimonitor.thingspeak.Models.Last;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by scristea on 10/9/2015.
 */
public interface IThingspeakAPI {

    @GET("/last.json")
    void getLastAsync(Callback<Last> callback);
}
