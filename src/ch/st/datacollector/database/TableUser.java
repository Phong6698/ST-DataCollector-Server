package ch.st.datacollector.database;

import ch.st.datacollector.model.Summoner;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Phong6698 on 15.05.2016.
 * Class for table USER in database
 */
public class TableUser extends Database{

    /**
     * just for testing
     */
    public void getAllUsers(){
        openCon();
        try {
            ps = con.prepareStatement("SELECT * FROM user");
            rs = ps.executeQuery();
            while (rs.next()) {
               System.out.println(rs.getString("Username"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon();
        }


    }

}
