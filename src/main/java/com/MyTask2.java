package com;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by qwj on 2017/8/30.
 */

/**
 * 基于注解的定时器
 */
@Component
public class MyTask2 {
    /**
     * 定时计算。每天凌晨 01:00 执行一次
     */
    @Scheduled(cron = "*/5 * * * * *")
    public void show() {
        System.out.println("show method 2");
    }

    /**
     * 启动时执行一次，之后每隔2秒执行一次
     */
    @Scheduled(fixedRate = 1000*2)
    public void print() {
        System.out.println("print method 2");
    }
}
