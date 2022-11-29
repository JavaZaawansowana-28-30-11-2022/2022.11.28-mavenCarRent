package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import com.comarch.szkolenia.car.rent.engine.Engine;
import com.comarch.szkolenia.car.rent.engine.IEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext pudeleczko =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        IEngine engine = pudeleczko.getBean(IEngine.class);
        engine.start();
    }
}
