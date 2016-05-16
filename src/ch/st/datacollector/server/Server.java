package ch.st.datacollector.server;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Phong6698 on 16.05.2016.
 */
public class Server extends Thread{

    private boolean running;
    Timer timer = new Timer();

    public void run(){
        while (running){
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Hello");
                }
            }, 1*60*1000, 1*60*1000);
        }
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
