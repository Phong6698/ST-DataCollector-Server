package ch.st.datacollector.main;

import ch.st.datacollector.controller.DatabaseController;
import ch.st.datacollector.controller.JsonController;
import ch.st.datacollector.server.Server;

/**
 * Created by Phong6698 on 14.05.2016.
 *
 */
public class Main {

	public static void main(String[] args) {
        System.out.println("Hello");

//        DatabaseController.getInstance().getAllUsers();
//        JsonController.getInstance().getGames();

        Server server = new Server();
        server.start();
        server.setRunning(true);
        server.setRunning(false);
        server.setRunning(true);

	}

}
