package com;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by qwj on 2017/8/30.
 */
@Component("helloController")
public class HelloController {
    @Scheduled(cron = "*/5 * * * * ?")
    public void demoServiceMethod(){
        System.out.println("Method executed at every 5 seconds. Current time is :: " +
                (new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));

    }
}
