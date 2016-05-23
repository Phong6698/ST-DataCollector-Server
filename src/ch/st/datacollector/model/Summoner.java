package ch.st.datacollector.model;

import java.util.ArrayList;

/**
 * Created by Phong6698 on 15.05.2016.
 * Summoner Model
 */
public class Summoner {

    private int id;
    private long summonerId;
    private String name;
    private String region;
    private ArrayList<Game> games;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSummonerId() {
        return summonerId;
    }

    public void setSummonerId(long summonerId) {
        this.summonerId = summonerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
