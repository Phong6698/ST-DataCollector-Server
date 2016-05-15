package ch.st.datacollector.controller;

import ch.st.datacollector.database.TableUser;

/**
 * Created by Phong6698 on 15.05.2016.
 * Controller for database
 */
public class DatabaseController {
    private static DatabaseController instance = new DatabaseController();

    private final TableUser TABLE_USER = new TableUser();

    public static DatabaseController getInstance() {
        return instance;
    }

    private DatabaseController() {
    }

    /**
     * just for testing
     */
    public void getAllUsers(){
        TABLE_USER.getAllUsers();
    }
}
