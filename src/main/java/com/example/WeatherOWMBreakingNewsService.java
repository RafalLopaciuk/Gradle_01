package com.example;

import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.model.CurrentWeather;
import org.springframework.beans.factory.annotation.Value;

public class WeatherOWMBreakingNewsService implements BreakingNewsService{
    @Value("${weather.city}")
    private String city;
    @Value("${weather.api}")
    private String api;

    @Override
    public String getBreakingNews(){
        OWM owm = new OWM(this.api);
        owm.setUnit(OWM.Unit.METRIC);

        CurrentWeather cwd = null;
        try {
            cwd = owm.currentWeatherByCityName(this.city);
        } catch (APIException e) {
            e.printStackTrace();
        }

//        System.out.println(this.api);
//        System.out.println(this.city);

        return "Temparatura w miescie " + this.city + ": \nminimalna = " + cwd.getMainData().getTempMin()
                + "\'C\nmaksymalna = " + cwd.getMainData().getTempMax() + "\'C";
    }
}
