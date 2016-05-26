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

        JSONObject jsonObject = new JSONObject(jsonString);
        JSONArray gamesJsonArray = jsonObject.getJSONArray("games");
        for (int i = 0; i < gamesJsonArray.length(); i++) {
            Game game = new Game();

            //obj game
            JSONObject gameJsonObject = gamesJsonArray.getJSONObject(i);

            game.setGameId(getCheckedObject(gameJsonObject, "gameId", "long"));
            game.setInvalid(getCheckedObject(gameJsonObject, "invalid", "boolean"));
            game.setGameMode(getCheckedObject(gameJsonObject, "gameMode", "String"));
            game.setGameType(getCheckedObject(gameJsonObject, "gameType", "String"));
            game.setSubType(getCheckedObject(gameJsonObject, "subType", "String"));
            game.setMapId(getCheckedObject(gameJsonObject, "mapId", "int"));
            game.setChampionId(getCheckedObject(gameJsonObject, "championId", "int"));
            game.setSpell1(getCheckedObject(gameJsonObject, "spell1", "int"));
            game.setSpell2(getCheckedObject(gameJsonObject, "spell2", "int"));
            game.setIpEarned(getCheckedObject(gameJsonObject, "ipEarned", "int"));
            game.setCreateDate(getCheckedObject(gameJsonObject, "createDate", "long"));

            //obj stats
            JSONObject gameStatsJsonObject = gameJsonObject.getJSONObject("stats");

            game.setLevel(getCheckedObject(gameStatsJsonObject, "level", "int"));
            game.setGoldEarned(getCheckedObject(gameStatsJsonObject, "goldEarned", "int"));
            game.setNumDeath(getCheckedObject(gameStatsJsonObject, "numDeath", "int"));
            game.setBarracksKilled(getCheckedObject(gameStatsJsonObject, "barracksKilled", "int"));
            game.setTurretsKilled(getCheckedObject(gameStatsJsonObject, "turretsKilled", "int"));
            game.setMinionsKilled(getCheckedObject(gameStatsJsonObject, "minionsKilled", "int"));
            game.setChampionsKilled(getCheckedObject(gameStatsJsonObject, "championsKilled", "int"));
            game.setGoldSpent(getCheckedObject(gameStatsJsonObject, "goldSpent", "int"));
            game.setTotalDamageDealt(getCheckedObject(gameStatsJsonObject, "totalDamageDealt", "int"));
            game.setTotalDamageTaken(getCheckedObject(gameStatsJsonObject, "totalDamageTaken", "int"));
            game.setDoubleKills(getCheckedObject(gameStatsJsonObject, "doubleKills", "int"));
            game.setTripleKills(getCheckedObject(gameStatsJsonObject, "tripleKills", "int"));
            game.setQuadraKills(getCheckedObject(gameStatsJsonObject, "quadraKills", "int"));
            game.setPentaKills(getCheckedObject(gameStatsJsonObject, "pentaKills", "int"));
            game.setKillingSprees(getCheckedObject(gameStatsJsonObject, "killingSprees", "int"));
            game.setLargestKillingSpree(getCheckedObject(gameStatsJsonObject, "largestKillingSpree", "int"));
            game.setTeam(getCheckedObject(gameStatsJsonObject, "team", "int"));
            game.setWin(getCheckedObject(gameStatsJsonObject, "win", "boolean"));
            game.setNeutralMinionsKilled(getCheckedObject(gameStatsJsonObject, "neutralMinionsKilled", "int"));
            game.setLargestMultiKill(getCheckedObject(gameStatsJsonObject, "largestMultiKill", "int"));
            game.setPhysicalDamageDealtPlayer(getCheckedObject(gameStatsJsonObject, "physicalDamageDealtPlayer", "int"));
            game.setMagicDamageDealtPlayer(getCheckedObject(gameStatsJsonObject, "magicDamageDealtPlayer", "int"));
            game.setPhysicalDamageTaken(getCheckedObject(gameStatsJsonObject, "physicalDamageTaken", "int"));
            game.setMagicDamageTaken(getCheckedObject(gameStatsJsonObject, "magicDamageTaken", "int"));
            game.setLargestCriticalStrike(getCheckedObject(gameStatsJsonObject, "largestCriticalStrike", "int"));
            game.setTimePlayed(getCheckedObject(gameStatsJsonObject, "timePlayed", "int"));
            game.setTotalHeal(getCheckedObject(gameStatsJsonObject, "totalHeal", "int"));
            game.setTotalUnitsHealed(getCheckedObject(gameStatsJsonObject, "totalUnitsHealed", "int"));
            game.setAssists(getCheckedObject(gameStatsJsonObject, "assists", "int"));
            game.setItem0(getCheckedObject(gameStatsJsonObject, "item0", "int"));
            game.setItem1(getCheckedObject(gameStatsJsonObject, "item1", "int"));
            game.setItem2(getCheckedObject(gameStatsJsonObject, "item2", "int"));
            game.setItem3(getCheckedObject(gameStatsJsonObject, "item3", "int"));
            game.setItem4(getCheckedObject(gameStatsJsonObject, "item4", "int"));
            game.setItem5(getCheckedObject(gameStatsJsonObject, "item5", "int"));
            game.setItem6(getCheckedObject(gameStatsJsonObject, "item6", "int"));
            game.setMagicDamageDealtToChampions(getCheckedObject(gameStatsJsonObject, "magicDamageDealtToChampions", "int"));
            game.setPhysicalDamageDealtToChampions(getCheckedObject(gameStatsJsonObject, "physicalDamageDealtToChampions", "int"));
            game.setTotalDamageDealtToChampions(getCheckedObject(gameStatsJsonObject, "totalDamageDealtToChampions", "int"));
            game.setTrueDamageDealtPlayer(getCheckedObject(gameStatsJsonObject, "trueDamageDealtPlayer", "int"));
            game.setTrueDamageDealtToChampions(getCheckedObject(gameStatsJsonObject, "trueDamageDealtToChampions", "int"));
            game.setTrueDamageTaken(getCheckedObject(gameStatsJsonObject, "trueDamageTaken", "int"));
            game.setWardKilled(getCheckedObject(gameStatsJsonObject, "wardKilled", "int"));
            game.setWardPlaced(getCheckedObject(gameStatsJsonObject, "wardPlaced", "int"));
            game.setNeutralMinionsKilledEnemyJungle(getCheckedObject(gameStatsJsonObject, "neutralMinionsKilledEnemyJungle", "int"));
            game.setNeutralMinionsKilledYourJungle(getCheckedObject(gameStatsJsonObject, "neutralMinionsKilledYourJungle", "int"));
            game.setTotalTimeCrowdControlDealt(getCheckedObject(gameStatsJsonObject, "totalTimeCrowdControlDealt", "int"));
            game.setPlayerRole(getCheckedObject(gameStatsJsonObject, "playerRole", "int"));
            game.setPlayerPosition(getCheckedObject(gameStatsJsonObject, "playerPosition", "int"));
            game.setBountyLevel(getCheckedObject(gameStatsJsonObject, "bountyLevel", "int"));
            game.setNexusKilled(getCheckedObject(gameStatsJsonObject, "nexusKilled", "boolean"));

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
