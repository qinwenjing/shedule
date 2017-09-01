package quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

/**
 * Created by qwj on 2017/9/1.
 */
public class Job1 extends QuartzJobBean {
    private int timeout;
    private static int i = 0;
    public void  setTimeout(int timeout){
        this.timeout = timeout;
    }
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("定时任务执行。。。。。");

    }
}
