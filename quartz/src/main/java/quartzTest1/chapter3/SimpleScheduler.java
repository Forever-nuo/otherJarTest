package quartzTest1.chapter3;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Forever丶诺 on 2017-12-24.
 */
public class SimpleScheduler {

    Scheduler scheduler ;

    public static void main(String[] args) {
        SimpleScheduler scheduler = new SimpleScheduler();
        scheduler.startScheduler();
    }

    /**
     * 开启一个调度器
     */
    public void startScheduler() {
        try {
            //获得调度器
            scheduler = StdSchedulerFactory.getDefaultScheduler();
            //开启调度器
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


    /**
     * 设置调度器为暂停模式
     */
    public void modifyScheduler() {
        try {
            if (!scheduler.isInStandbyMode()) { //判断调度器是否在暂停状态
                scheduler.standby();  //暂停操作
            }

            // 操作修改....

            //重新启动
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
