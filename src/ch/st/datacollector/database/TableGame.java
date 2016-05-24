package ch.st.datacollector.database;

import ch.st.datacollector.model.Game;
import ch.st.datacollector.model.Summoner;

import java.sql.SQLException;

/**
 * Created by Phong6698 on 15.05.2016.
 * Class for table GAME in database
 */
public class TableGame extends Database {

    /**
     * get the latest game with only createDate by SummonerId
     * @param summonerId
     * @return Game
     */
    public Game getLatestGameBySummoner(long summonerId){
        openCon();
        Game game = new Game();
        try {
            ps = con.prepareStatement("SELECT createDate FROM `game` WHERE Summoner_ID = ? ORDER BY createDate DESC;");
            ps.setLong(1, summonerId);
            rs = ps.executeQuery();
            while (rs.next()) {
                game.setId(rs.getInt("ID_Game"));
                game.setCreateDate(rs.getLong("createDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeCon();
        }
        return game;
    }
}
