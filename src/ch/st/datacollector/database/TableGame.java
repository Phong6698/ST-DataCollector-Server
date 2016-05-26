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
     * @param summoner_ID Summoner_ID (foreign key)
     * @return Game Game Object
     */
    public Game getLatestGameBySummoner(int summoner_ID){
        openCon();
        Game game = new Game();
        try {
            ps = con.prepareStatement("SELECT * FROM game WHERE Summoner_ID = ? ORDER BY createDate DESC;");
            ps.setInt(1, summoner_ID);
            rs = ps.executeQuery();
            if(rs.first()) {
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


    /**
     * Save game by summoner
     * @param game Game Object
     * @param summoner_ID Summoner_ID (foreign key)
     */
    public void saveGameBySummoner(Game game, int summoner_ID){

        openCon();

        try {
            ps = con.prepareStatement("INSERT INTO `summoner-tracker`.`game` VALUES(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setLong(1, game.getGameId());
            ps.setBoolean(2, game.isInvalid());
            ps.setString(3, game.getGameMode());
            ps.setString(4, game.getGameType());
            ps.setString(5, game.getSubType());
            ps.setInt(6, game.getMapId());
            ps.setInt(7, game.getChampionId());
            ps.setInt(8, game.getSpell1());
            ps.setInt(9, game.getSpell2());
            ps.setInt(10, game.getIpEarned());
            ps.setLong(11, game.getCreateDate());
            ps.setInt(12, game.getLevel());
            ps.setInt(13, game.getGoldEarned());
            ps.setInt(14, game.getNumDeath());
            ps.setInt(15, game.getBarracksKilled());
            ps.setInt(16, game.getTurretsKilled());
            ps.setInt(17, game.getMinionsKilled());
            ps.setInt(18, game.getChampionsKilled());
            ps.setInt(19, game.getGoldSpent());
            ps.setInt(20, game.getTotalDamageDealt());
            ps.setInt(21, game.getTotalDamageTaken());
            ps.setInt(22, game.getDoubleKills());
            ps.setInt(23, game.getTripleKills());
            ps.setInt(24, game.getQuadraKills());
            ps.setInt(25, game.getPentaKills());
            ps.setInt(26, game.getKillingSprees());
            ps.setInt(27, game.getLargestKillingSpree());
            ps.setInt(28, game.getTeam());
            ps.setBoolean(29, game.isWin());
            ps.setInt(30, game.getNeutralMinionsKilled());
            ps.setInt(31, game.getLargestMultiKill());
            ps.setInt(32, game.getPhysicalDamageDealtPlayer());
            ps.setInt(33, game.getMagicDamageDealtPlayer());
            ps.setInt(34, game.getPhysicalDamageTaken());
            ps.setInt(35, game.getMagicDamageTaken());
            ps.setInt(36, game.getLargestCriticalStrike());
            ps.setInt(37, game.getTimePlayed());
            ps.setInt(38, game.getTotalHeal());
            ps.setInt(39, game.getTotalUnitsHealed());
            ps.setInt(40, game.getAssists());
            ps.setInt(41, game.getItem0());
            ps.setInt(42, game.getItem1());
            ps.setInt(43, game.getItem2());
            ps.setInt(44, game.getItem3());
            ps.setInt(45, game.getItem4());
            ps.setInt(46, game.getItem5());
            ps.setInt(47, game.getItem6());
            ps.setInt(48, game.getMagicDamageDealtToChampions());
            ps.setInt(49, game.getPhysicalDamageDealtToChampions());
            ps.setInt(50, game.getTotalDamageDealtToChampions());
            ps.setInt(51, game.getTrueDamageDealtPlayer());
            ps.setInt(52, game.getTrueDamageDealtToChampions());
            ps.setInt(53, game.getTrueDamageTaken());
            ps.setInt(54, game.getWardKilled());
            ps.setInt(55, game.getWardPlaced());
            ps.setInt(56, game.getNeutralMinionsKilledEnemyJungle());
            ps.setInt(57, game.getNeutralMinionsKilledYourJungle());
            ps.setInt(58, game.getTotalTimeCrowdControlDealt());
            ps.setInt(59, game.getPlayerRole());
            ps.setInt(60, game.getPlayerPosition());
            ps.setInt(61, game.getBountyLevel());
            ps.setBoolean(62, game.isNexusKilled());
            ps.setInt(63, summoner_ID);



            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
