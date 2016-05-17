package ch.st.datacollector.main;

import ch.st.datacollector.controller.DatabaseController;
import ch.st.datacollector.controller.JsonController;
import ch.st.datacollector.server.DataCollector;
import ch.st.datacollector.server.Server;
import ch.st.datacollector.server.TimeTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

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

        TimeTest timeTest = new TimeTest();
        timeTest.start();
        timeTest.shutdown();
        timeTest.restart();

	}

}
