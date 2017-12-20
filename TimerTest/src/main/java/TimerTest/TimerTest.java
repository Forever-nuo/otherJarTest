package TimerTest;

import org.junit.Test;
import sun.applet.Main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Forever丶诺 on 2017-12-20.
 */
public class TimerTest {


    /**
     * 延迟多少秒后执行一次任务
     */
    public static void testSchedule1() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("输出....");
            }
        },3000);
    }

    /**
     * 在某个时间点执行一次
     */
    public static void testSchedule2(){
        Timer timer = new Timer();
        String time= "2017-12-20 23:41";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        Date Date = null;
        try {
            Date = dateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("输出....");
            }
        },Date);
    }


    public static void testSchedule3(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("输出....");
            }
        },3000,2000);
    }

    public static void main(String[] args) {
       // testSchedule1();
       // testSchedule2();
        testSchedule3();
    }
}
