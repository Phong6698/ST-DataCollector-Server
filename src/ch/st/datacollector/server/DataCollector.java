package ch.st.datacollector.server;

import ch.st.datacollector.controller.DatabaseController;
import ch.st.datacollector.controller.JsonController;
import ch.st.datacollector.model.Game;
import ch.st.datacollector.model.Summoner;

import java.util.ArrayList;

/**
 * Created by Phong6698 on 17.05.2016.
 *
 * @author Phong6698
 */
public class DataCollector {

    public static void checkData(){
        ArrayList<Summoner> summoners = DatabaseController.getInstance().getAllSummonersWithLatestGame();

        for(Summoner summoner : summoners){
            long createDateDB = summoner.getGames().get(0).getCreateDate();

            Summoner apiSummoner = JsonController.getInstance().getSummonerWithLatestTenGames(summoner.getSummonerId(), summoner.getRegion());
            System.out.println("\nSummoner: " + summoner.getSummonerId());
            for(Game apiGame : apiSummoner.getGames()){
                System.out.println(createDateDB+" : "+apiGame.getCreateDate());
                if(createDateDB < apiGame.getCreateDate() && apiGame.getGameMode().equals("CLASSIC") && apiGame.getGameType().equals("MATCHED_GAME") && apiGame.getSubType().equals("NORMAL")){
                    System.out.println("Save");
                    DatabaseController.getInstance().saveGameBySummoner(apiGame, summoner.getId());
                }
            }

        }
    }

}
