package ch.st.datacollector.controller;

import ch.st.datacollector.json.JsonLoader;

/**
 * Created by Phong6698 on 15.05.2016.
 * Controller for json
 */
public class JsonController {
    private static JsonController instance = new JsonController();
    private final JsonLoader JSON_LOADER = new JsonLoader();
    private final String  API_KEY = "58453580-a12b-497a-bdde-d1255bd0fda3";

    public static JsonController getInstance() {
        return instance;
    }

    private JsonController() {
    }

    /**
     * just for testing
     */
    public void getGames(){
        String jsonString = JSON_LOADER.getJsonString("https://euw.api.pvp.net/api/lol/euw/v1.3/game/by-summoner/67540676/recent?api_key="+API_KEY);
        System.out.println(jsonString);
    }

    public void getSummonerWithLatestTenGames(long summonerId, String region){
        //TODO REGION
        String jsonString = JSON_LOADER.getJsonString("https://"+region+".api.pvp.net/api/lol/"+region+"/v1.3/game/by-summoner/"+summonerId+"/recent?api_key="+API_KEY);

        //TODO PARSING
    }
}
