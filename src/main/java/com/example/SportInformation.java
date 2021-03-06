package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportInformation implements Information{
    @Value("${sport.name}")
    private String name;
    private String description;
//    @Autowired
//    @Qualifier("sportBreakingNewsService")
    private BreakingNewsService breakingNewsService;

//    @Autowired
    public SportInformation(@Qualifier("sportBreakingNewsService")BreakingNewsService breakingNewsService) {
        this.breakingNewsService = breakingNewsService;
    }

    @Autowired
    @Qualifier("sportBreakingNewsService")
    public void setBreakingNewsService(BreakingNewsService breakingNewsService)
    {
        this.breakingNewsService = breakingNewsService;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public String getName() {
        return name;
    }

    public String getBreakingNews() {
        return breakingNewsService.getBreakingNews();
    }

    @Override
    public String getInformation() {
        return null;
    }
}