package ch.st.datacollector.server;

import java.util.Timer;
import java.util.TimerTask;

import ch.st.datacollector.view.ServerView;

public class CountDownTask {
	
	private Timer timer;
	private long countdown;
	private ServerView serverView;

	public CountDownTask(long countdown, ServerView serverView) {
		this.countdown = countdown+1;
		this.timer = new Timer();
		this.serverView = serverView;
		countDown();
		
	}
	
	public void countDown(){
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				if(countdown == 1){
					timer.cancel();
				}
				--countdown;
					setTime();
	
	
				}
			}, 0, 1000);
	}
	
	public void setTime(){
//		serverView.getTime().setText(String.format("%d:%02d", countdown / 60, countdown % 60));
	}
	
}
