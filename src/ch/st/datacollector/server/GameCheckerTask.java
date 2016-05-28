package ch.st.datacollector.server;

import java.util.ArrayList;
import java.util.Date;

import ch.st.datacollector.controller.DatabaseController;
import ch.st.datacollector.controller.JsonController;
import ch.st.datacollector.model.Game;
import ch.st.datacollector.model.Summoner;

public class GameCheckerTask extends ServerTask{

	public GameCheckerTask(long delayStart, long delay) {
		super(delayStart, delay);
	}

	@Override
	public void doTask() {
		System.out.println("\n*** "+new Date()+" ***");
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
