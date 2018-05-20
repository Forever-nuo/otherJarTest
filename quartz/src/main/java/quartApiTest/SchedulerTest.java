package quartApiTest;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by Forever丶诺 on 2017-12-24.
 */
public class SchedulerTest {

    public static void main(String[] args) {
        SchedulerTest test = new SchedulerTest();
        test.createScheduler();
    }

    /**
     * @param :
     * @Description: 创建Scheduler对象
     * @Author: Forever丶诺
     * @Date: 9:30 2017-12-24
     */
    public void createScheduler() {
        try {
            //获得默认的scheduler
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            System.out.println(scheduler);
            //获得某个名称的scheduler
           /* SchedulerFactory schFact = new StdSchedulerFactory();
            schFact.getScheduler("name1");*/
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }


}
