package com.example;

public class WeatherInformation implements Information{
    private BreakingNewsService breakingNewsService;

    @Override
    public String getInformation() {
        return "\"weather\": " +
                "[{\"id\":800,\"main\":\"Clear\",\"description\":" +
                "\"Sky is Clear\",\"icon\":\"01n\"}";
    }

    public WeatherInformation(BreakingNewsService breakingNewsService) {
        this.breakingNewsService = breakingNewsService;
    }

    public String getBreakingNews(){
        return breakingNewsService.getBreakingNews();
    }

}
