package ch.st.datacollector.controller;

import ch.st.datacollector.database.TableGame;
import ch.st.datacollector.database.TableSummoner;
import ch.st.datacollector.database.TableUser;
import ch.st.datacollector.model.Game;
import ch.st.datacollector.model.Summoner;

import java.util.ArrayList;

/**
 * Created by Phong6698 on 15.05.2016.
 * Controller for database
 */
public class DatabaseController {
    private static DatabaseController instance = new DatabaseController();

    private final TableUser TABLE_USER = new TableUser();
    private final TableSummoner TABLE_SUMMONER = new TableSummoner();
    private final TableGame TABLE_GAME = new TableGame();

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

    /**
     * get ArrayList of Summoner contains with the latest game with createDate
     * @return ArrayList Summoner
     */
    public ArrayList<Summoner> getAllSummonersWithLatestGame(){
        ArrayList<Summoner> summoners = TABLE_SUMMONER.getAllSummoners();
        for(Summoner summoner : summoners){
            ArrayList<Game> games = new ArrayList<>();
            games.add(TABLE_GAME.getLatestGameBySummoner(summoner.getId()));
            summoner.setGames(games);
        }
        return summoners;
    }

    /**
     * Save game by summoner
     * @param game Game Object
     * @param summoner_ID Summoner_ID (foreign key)
     */
    public void saveGameBySummoner(Game game, int summoner_ID){
        TABLE_GAME.saveGameBySummoner(game, summoner_ID);

    }
}
