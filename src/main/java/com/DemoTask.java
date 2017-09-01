package com; /**
 * Created by qwj on 2017/8/30.
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("demoTask")
public class DemoTask {
    private Logger logger = LoggerFactory.getLogger(DemoTask.class);

    @Scheduled(fixedDelay = 1000)//@Scheduled 可以作为一个 触发源 添加到一个方法中
    //以一个 固定延迟时间 1秒钟调用一次执行
    // 这个周期是 以 上一个调用任务 ##完成时间## 为基准，在上一个任务完成之后，5s后再次执行
    public void demo1(){
        logger.info("定时任务demo1开始......");
        long begin = System.currentTimeMillis();
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("定时任务demo1结束，共耗时：[" + (end-begin)+ "]毫秒");
    }

    @Scheduled(fixedRate  = 1000)
    //以一个 固定延迟时间 1秒钟调用一次执行
    // 这个周期是以 上一个任务 ##开始时间## 为基准，从上一任务开始执行后5s再次调用：
    public void demo2(){
        logger.info("定时任务demo2开始.");
        long begin = System.currentTimeMillis();
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("定时任务demo2结束，共耗时：[" + (end-begin)+ "]毫秒");
    }

    @Scheduled(cron = "*/5 * * * * ?") //如果你需要在特定的时间执行，就需要用到cron 了
    //这里是在每天的13点30分执行一次
    public void demo3(){
        logger.info("定时任务demo3开始.");
        long begin = System.currentTimeMillis();
        //执行你需要操作的定时任务
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        logger.info("定时任务demo3结束，共耗时：[" + (end-begin)+ "]毫秒");
    }

}