package com.cusguss.fungimonitor.thingspeak;

import retrofit.RequestInterceptor;

/**
 * Created by scristea on 10/9/2015.
 */
public class SessionRequestInterceptor implements RequestInterceptor {

    @Override
    public void intercept(RequestInterceptor.RequestFacade request) {
        request.addHeader("ContentType", " application/json; charset=utf-8");
        request.addQueryParam("key", "OUXGCPULZAKPPUPI");
    }

}
