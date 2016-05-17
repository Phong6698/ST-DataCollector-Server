package ch.st.datacollector.server;

import ch.st.datacollector.controller.DatabaseController;
import ch.st.datacollector.model.Summoner;

import java.util.ArrayList;

/**
 * Created by Phong6698 on 17.05.2016.
 */
public class DataCollector {

    public static void checkData(){
        ArrayList<Summoner> summoners = DatabaseController.getInstance().getAllSummonersWithLatestGame();

        for(Summoner summoner : summoners){
            long createDateDB = summoner.getGames().get(0).getCreateDate();
            //TODO CHECKING
        }
    }

}
