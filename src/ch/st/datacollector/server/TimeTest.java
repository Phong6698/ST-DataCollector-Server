package ch.st.datacollector.server;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Phong6698 on 17.05.2016.
 */
public class TimeTest{

    private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

    public TimeTest(){

    }


    public static void checker(){
        System.out.println("3 Seconds: "+new Date());
    }

    public void start(){
        if(executorService.isShutdown()) {
            executorService = Executors.newSingleThreadScheduledExecutor();

            //Java 8
            executorService.scheduleAtFixedRate(TimeTest::checker, 0, 3, TimeUnit.SECONDS);

//            //Java 7
//            executorService.scheduleAtFixedRate(new Runnable() {
//                @Override
//                public void run() {
//                    checker();
//                }
//            }, 0, 3, TimeUnit.SECONDS);

        }
    }

    public void shutdown(){
        if(!executorService.isShutdown()){
            executorService.shutdown();
        }
    }

    public void restart(){
        shutdown();
        start();
    }
}