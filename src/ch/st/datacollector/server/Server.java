package ch.st.datacollector.server;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Phong6698 on 16.05.2016.
 */
public class Server {

    private boolean running;
    final static ScheduledExecutorService EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();

    public Server(){
        TimeTest timeTest = new TimeTest();
        timeTest.start();
    }

    public void start(){

    }

    public void shutdown(){

    }

    public void restart(){

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
