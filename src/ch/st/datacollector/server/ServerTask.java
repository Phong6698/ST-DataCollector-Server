package ch.st.datacollector.server;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 
 * Created by Phong6698 on 27.05.2016.
 *
 * @author Phong6698
 */
public abstract class ServerTask { 
	
	private static ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
	private long delayStart;
	private long delay;
	
	
	/**
	 * Constructor
	 * @param delayStart Delay after start the task in seconds
	 * @param delay Delay between tasks in seconds
	 */
	public ServerTask(long delayStart, long delay){
		executorService.shutdown();
		this.delayStart = delayStart;
		this.delay = delay;
	}
	
	/**
	 * The Task to do
	 */
	public abstract void doTask();

	/**
	 * Start Task
	 */
    public void start(){
    	
        if(executorService.isShutdown()) {
        	System.out.println("Start Task");
            executorService = Executors.newSingleThreadScheduledExecutor();

            //Java 8
//            executorService.scheduleAtFixedRate(TimeTest::checker, delayStart, delay, TimeUnit.SECONDS);

            //Java 7
            executorService.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                	doTask();
                }
            }, delayStart, delay, TimeUnit.SECONDS);

        }
    }

    /**
     * Shutdown Task
     */
    public void shutdown(){
        if(!executorService.isShutdown()){
            executorService.shutdown();
        }
    }

    /**
     * Restart Task
     */
    public void restart(){
        shutdown();
        start();
    }
	
}
