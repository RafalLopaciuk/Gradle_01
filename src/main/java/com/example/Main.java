package com.example;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;

public class Main {
    public static void main(String[] args) throws APIException {
//        Samochod samochod = new Samochod();
//        System.out.println(samochod);
//        Samochod samochod2 = new Samochod(new Kola(1), new Silnik(2), new Karoseria("3"));
//        System.out.println(samochod2);
//        Information wi=new WeatherInformation();
//        System.out.println(wi.getInformation());

//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Information information = context.getBean("weatherInformation", Information.class);
//        System.out.println(information.getInformation() + " 123");
//        System.out.println( ( (WeatherInformation) information).getBreakingNews() );

//        ClassPathXmlApplicationContext contextAdd =
//                new ClassPathXmlApplicationContext("applicationContextAdd.xml");
//        SportInformation si =
//                contextAdd.getBean("sportInformation", SportInformation.class);
//        System.out.println(si.getBreakingNews());
//        System.out.println(si.getName());
//        contextAdd.close();

//        AnnotationConfigApplicationContext contextNoxml =
//                new AnnotationConfigApplicationContext(InformationConfig.class);
//        SportInformation si2 =
//                contextNoxml.getBean("sportInformation",SportInformation.class);
//        System.out.println("no xml breaking sport news : "+si2.getBreakingNews());
//        System.out.println(si2.getName());
//        contextNoxml.close();

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        WeatherOWMBreakingNewsService news = context.getBean("weatherOWMBreakingNewsService", WeatherOWMBreakingNewsService.class);
        System.out.println(news.getBreakingNews());
    }
}
