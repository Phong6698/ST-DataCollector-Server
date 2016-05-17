package ch.st.datacollector.server;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Phong6698 on 16.05.2016.
 */
public class Server extends Thread{

    private boolean running;
    Timer timer = new Timer();

    public void run(){
        while (running){
            final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
            executorService.scheduleAtFixedRate(Server::checker, 10, 1, TimeUnit.SECONDS);

//            timer.scheduleAtFixedRate(new TimerTask() {
//                @Override
//                public void run() {
//                    System.out.println("Hello");
//                }
//            }, 1*60*1000, 1*60*1000);
        }
    }

    public static void checker(){
        System.out.println("Hello");
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        if(running){
            System.out.println("Server: On");
        } else {
            System.out.println("Server: Off");
        }
        this.running = running;
    }
}
