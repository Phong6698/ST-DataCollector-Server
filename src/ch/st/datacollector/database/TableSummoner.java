package ch.st.datacollector.database;

import ch.st.datacollector.model.Summoner;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Phong6698 on 15.05.2016.
 * Class for table SUMMONER in database
 */
public class TableSummoner extends Database{

    /**
     *  get all summoners in database
     * @return ArrayList Summoner
     */
    public ArrayList<Summoner> getAllSummoners(){
        ArrayList<Summoner> summoners = new ArrayList<>();
        openCon();
        try {
            ps = con.prepareStatement("SELECT * FROM summoner");
            rs = ps.executeQuery();
            while (rs.next()) {
                Summoner summoner = new Summoner();
                summoner.setId(rs.getInt("ID_Summoner"));
                summoner.setSummonerId(rs.getLong("summonerId"));
                summoners.add(summoner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon();
        }
        return summoners;
    }
}
