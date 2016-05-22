package ch.st.datacollector.controller;

import ch.st.datacollector.json.JsonLoader;
import ch.st.datacollector.model.Game;
import ch.st.datacollector.model.Summoner;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Objects;

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

    /**
     * Get Summoner Object with ten latest games
     * @param summonerId summonerId from a Summoner
     * @param region region where the Summoner is
     * @return Summoner
     */
    public Summoner getSummonerWithLatestTenGames(long summonerId, String region){
        //TODO REGION
        Summoner summoner = new Summoner();
        ArrayList<Game> games = new ArrayList<>();
        String jsonString = JSON_LOADER.getJsonString("https://"+region+".api.pvp.net/api/lol/"+region+"/v1.3/game/by-summoner/"+summonerId+"/recent?api_key="+API_KEY);

        //TODO PARSING
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray gamesJsonArray = jsonObject.getJSONArray("games");
        for (int i = 0; i < gamesJsonArray.length(); i++) {
            Game game = new Game();
            JSONObject gameJsonObject = gamesJsonArray.getJSONObject(i);

            //getCheckedObject(gameJsonObject, "subType", "String")
            game.setGameId(getCheckedObject(gameJsonObject, "gameId", "long"));
            game.setInvalid(getCheckedObject(gameJsonObject, "invalid", "boolean"));
            game.setGameType(getCheckedObject(gameJsonObject, "gameType", "String"));
            game.setSubType(getCheckedObject(gameJsonObject, "subType", "String"));



            games.add(game);
        }

        summoner.setGames(games);

        return summoner;



    }


    /**
     * Get any type of Object that is checked for null before
     * @param jsonObject JSON Object
     * @param key Key Tag
     * @param type Type
     * @param <Any> Any
     * @return Any type of Object
     */
    private <Any> Any getCheckedObject(JSONObject jsonObject, String key, String type){
        Any any = null;

        switch (type) {
            case "String":
                if (jsonObject.has(key)) {
                    any = (Any) jsonObject.getString(key);
                } else {
                    any = (Any) "";
                }
                break;
            case "int":
                if (jsonObject.has(key)) {
                    any = (Any) new Integer(jsonObject.getInt(key));
                } else {
                    any = (Any) new Integer(0);
                }
                break;
            case "long":
                if (jsonObject.has(key)) {
                    any = (Any) new Long(jsonObject.getLong(key));
                } else {
                    any = (Any) new Long(0);
                }
                break;
            case "boolean":
                if (jsonObject.has(key)) {
                    any = (Any) new Boolean(jsonObject.getBoolean(key));
                } else {
                    any = (Any) new Boolean(false);
                }
                break;
            default:
                System.out.println("Wrong type: " + type);
                break;
        }

        return any;
    }
}
