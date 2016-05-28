package ch.st.datacollector.server;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * Created by Phong6698 on 16.05.2016.
 *
 * @author Phong6698
 */
public class Server {

    GameCheckerTask gameCheckerTask;

    public Server(){
        gameCheckerTask = new GameCheckerTask(0, 20);
    }

    public void start(){
        System.out.println("Start Server");
        gameCheckerTask.start();
    }

    public void shutdown(){
        System.out.println("Shutdown Server");
        gameCheckerTask.shutdown();
    }

    public void restart(){
        System.out.println("Restart Server");
        gameCheckerTask.restart();
    }
}
