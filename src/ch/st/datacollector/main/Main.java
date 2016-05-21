package ch.st.datacollector.main;

import ch.st.datacollector.view.ServerView;

/**
 * Created by Phong6698 on 14.05.2016.
 *
 */
public class Main {

	public static void main(String[] args) {

//        DatabaseController.getInstance().getAllUsers();
//        JsonController.getInstance().getGames();

//        Server server = new Server();
//        server.start();
//        server.setRunning(true);
//        server.setRunning(false);
//        server.setRunning(true);
//        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
//        executorService.scheduleAtFixedRate(DataCollector::checkData, 0, 10, TimeUnit.SECONDS);
//        executorService.scheduleAtFixedRate(TimeTest::checker, 0, 3, TimeUnit.SECONDS);

//        TimeTest timeTest = new TimeTest();
//        timeTest.start();
//        timeTest.shutdown();
//        timeTest.restart();
		
		new ServerView();

	}

}
