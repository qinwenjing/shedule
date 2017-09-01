package com;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;


/**
 * Created by qwj on 2017/8/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class MybatisTest {
    @Before
    public void before(){
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(lc);
        lc.reset();
        try {
            configurator.doConfigure(new ClassPathResource("logback.xml").getURL());//加载logback配置文件
        } catch (JoranException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //PropertyConfigurator.configure("/home/lhy/Workspaces/MyEclipse_data/gooddeep/src/main/java/config/log4j.properties");//加载logj配置文件
    }
    @Test
    public void test() throws InterruptedException {
        System.out.println("开始执行了...");
        Thread.sleep(10000);
        System.out.println("结束执行了...");
    }
}
