package ch.st.datacollector.server;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Phong6 on 17.05.2016.
 */
public class TimeTest {

    public static void main(String[] args) {
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(TimeTest::myTask, 0, 1, TimeUnit.SECONDS);
    }

    private static void myTask() {
        System.out.println("Running");
    }
}
