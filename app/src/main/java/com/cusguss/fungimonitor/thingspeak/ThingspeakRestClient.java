package com.cusguss.fungimonitor.thingspeak;

import retrofit.RestAdapter;
import retrofit.android.AndroidLog;

/**
 * Created by scristea on 10/9/2015.
 */
public class ThingspeakRestClient {

    private static ThingspeakRestClient _instance = null;
    private static String _ThingsSpeakAPIAdress = "http://api.thingspeak.com/channels/58673/feed/";
    private IThingspeakAPI _ThingsSpeakAPI;

    private ThingspeakRestClient() {

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(_ThingsSpeakAPIAdress)
                .setRequestInterceptor(new SessionRequestInterceptor())
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setLog(new AndroidLog("FUNGIMONITOR"))

                .build();

        _ThingsSpeakAPI = restAdapter.create(IThingspeakAPI.class);
    }

    public static IThingspeakAPI API() {

        if (_instance == null) {

            synchronized (ThingspeakRestClient.class) {

                if (_instance == null) {

                    _instance = new ThingspeakRestClient();
                }
            }
        }

        return _instance._ThingsSpeakAPI;

    }

}
