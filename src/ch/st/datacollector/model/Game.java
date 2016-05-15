package ch.st.datacollector.model;

/**
 * Created by Phong6 on 15.05.2016.
 * Game Model
 */
public class Game {

    private int id;
    private long gameId;
    private boolean invalid;
    private String gameMode;
    private String gameType;
    private String subType;
    private int mapId;
    private int championId;
    private int spell1;
    private int spell2;
    private int ipEarned;
    private long createDate;
    private int level;
    private int goldEarned;
    private int numDeath;
    private int barracksKilled;
    private int turretsKilled;
    private int minionsKilled;
    private int championsKilled;
    private int goldSpent;
    private int totalDamageDealt;
    private int totalDamageTaken;
    private int doubleKills;
    private int tripleKills;
    private int quadraKills;
    private int pentaKills;
    private int killingSprees;
    private int largestKillingSprees;
    private int team;
    private boolean win;
    private int neutralMinionsKilled;
    private int largestMultiKill;
    private int physicalDamageDealtPlayer;
    private int magicDamageDealtPlayer;
    private int physicalDamageTaken;
    private int magicDamageTaken;
    private int largestCriticalStrike;
    private int timePlayed;
    private int totalHeal;
    private int totalUnitsHealed;
    private int assists;
    private int item0;
    private int item1;
    private int item2;
    private int item3;
    private int item4;
    private int item5;
    private int item6;
    private int magicDamageDealtToChampions;
    private int physicalDamageDealtToChampions;
    private int totalDamageDealtToChampions;
    private int trueDamageDealtPlayer;
    private int trueDamageDealtToChampions;
    private int trueDamageTaken;
    private int wardKilled;
    private int wardPlaced;
    private int neutralMinionsKilledEnemyJungle;
    private int neutralMinionsKilledYourJungle;
    private int totalTimeCrowdControlDealt;
    private int playerRole;
    private int playerPosition;
    private int bountyLevel;
    private boolean nexusKilled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public int getMapId() {
        return mapId;
    }

    public void setMapId(int mapId) {
        this.mapId = mapId;
    }

    public int getChampionId() {
        return championId;
    }

    public void setChampionId(int championId) {
        this.championId = championId;
    }

    public int getSpell1() {
        return spell1;
    }

    public void setSpell1(int spell1) {
        this.spell1 = spell1;
    }

    public int getSpell2() {
        return spell2;
    }

    public void setSpell2(int spell2) {
        this.spell2 = spell2;
    }

    public int getIpEarned() {
        return ipEarned;
    }

    public void setIpEarned(int ipEarned) {
        this.ipEarned = ipEarned;
    }

    public long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(long createDate) {
        this.createDate = createDate;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(int goldEarned) {
        this.goldEarned = goldEarned;
    }

    public int getNumDeath() {
        return numDeath;
    }

    public void setNumDeath(int numDeath) {
        this.numDeath = numDeath;
    }

    public int getBarracksKilled() {
        return barracksKilled;
    }

    public void setBarracksKilled(int barracksKilled) {
        this.barracksKilled = barracksKilled;
    }

    public int getTurretsKilled() {
        return turretsKilled;
    }

    public void setTurretsKilled(int turretsKilled) {
        this.turretsKilled = turretsKilled;
    }

    public int getMinionsKilled() {
        return minionsKilled;
    }

    public void setMinionsKilled(int minionsKilled) {
        this.minionsKilled = minionsKilled;
    }

    public int getChampionsKilled() {
        return championsKilled;
    }

    public void setChampionsKilled(int championsKilled) {
        this.championsKilled = championsKilled;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int goldSpent) {
        this.goldSpent = goldSpent;
    }

    public int getTotalDamageDealt() {
        return totalDamageDealt;
    }

    public void setTotalDamageDealt(int totalDamageDealt) {
        this.totalDamageDealt = totalDamageDealt;
    }

    public int getTotalDamageTaken() {
        return totalDamageTaken;
    }

    public void setTotalDamageTaken(int totalDamageTaken) {
        this.totalDamageTaken = totalDamageTaken;
    }

    public int getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(int doubleKills) {
        this.doubleKills = doubleKills;
    }

    public int getTripleKills() {
        return tripleKills;
    }

    public void setTripleKills(int tripleKills) {
        this.tripleKills = tripleKills;
    }

    public int getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(int quadraKills) {
        this.quadraKills = quadraKills;
    }

    public int getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(int pentaKills) {
        this.pentaKills = pentaKills;
    }

    public int getKillingSprees() {
        return killingSprees;
    }

    public void setKillingSprees(int killingSprees) {
        this.killingSprees = killingSprees;
    }

    public int getLargestKillingSprees() {
        return largestKillingSprees;
    }

    public void setLargestKillingSprees(int largestKillingSprees) {
        this.largestKillingSprees = largestKillingSprees;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public int getNeutralMinionsKilled() {
        return neutralMinionsKilled;
    }

    public void setNeutralMinionsKilled(int neutralMinionsKilled) {
        this.neutralMinionsKilled = neutralMinionsKilled;
    }

    public int getLargestMultiKill() {
        return largestMultiKill;
    }

    public void setLargestMultiKill(int largestMultiKill) {
        this.largestMultiKill = largestMultiKill;
    }

    public int getPhysicalDamageDealtPlayer() {
        return physicalDamageDealtPlayer;
    }

    public void setPhysicalDamageDealtPlayer(int physicalDamageDealtPlayer) {
        this.physicalDamageDealtPlayer = physicalDamageDealtPlayer;
    }

    public int getMagicDamageDealtPlayer() {
        return magicDamageDealtPlayer;
    }

    public void setMagicDamageDealtPlayer(int magicDamageDealtPlayer) {
        this.magicDamageDealtPlayer = magicDamageDealtPlayer;
    }

    public int getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(int physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public int getMagicDamageTaken() {
        return magicDamageTaken;
    }

    public void setMagicDamageTaken(int magicDamageTaken) {
        this.magicDamageTaken = magicDamageTaken;
    }

    public int getLargestCriticalStrike() {
        return largestCriticalStrike;
    }

    public void setLargestCriticalStrike(int largestCriticalStrike) {
        this.largestCriticalStrike = largestCriticalStrike;
    }

    public int getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(int timePlayed) {
        this.timePlayed = timePlayed;
    }

    public int getTotalHeal() {
        return totalHeal;
    }

    public void setTotalHeal(int totalHeal) {
        this.totalHeal = totalHeal;
    }

    public int getTotalUnitsHealed() {
        return totalUnitsHealed;
    }

    public void setTotalUnitsHealed(int totalUnitsHealed) {
        this.totalUnitsHealed = totalUnitsHealed;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getItem0() {
        return item0;
    }

    public void setItem0(int item0) {
        this.item0 = item0;
    }

    public int getItem1() {
        return item1;
    }

    public void setItem1(int item1) {
        this.item1 = item1;
    }

    public int getItem2() {
        return item2;
    }

    public void setItem2(int item2) {
        this.item2 = item2;
    }

    public int getItem3() {
        return item3;
    }

    public void setItem3(int item3) {
        this.item3 = item3;
    }

    public int getItem4() {
        return item4;
    }

    public void setItem4(int item4) {
        this.item4 = item4;
    }

    public int getItem5() {
        return item5;
    }

    public void setItem5(int item5) {
        this.item5 = item5;
    }

    public int getItem6() {
        return item6;
    }

    public void setItem6(int item6) {
        this.item6 = item6;
    }

    public int getMagicDamageDealtToChampions() {
        return magicDamageDealtToChampions;
    }

    public void setMagicDamageDealtToChampions(int magicDamageDealtToChampions) {
        this.magicDamageDealtToChampions = magicDamageDealtToChampions;
    }

    public int getPhysicalDamageDealtToChampions() {
        return physicalDamageDealtToChampions;
    }

    public void setPhysicalDamageDealtToChampions(int physicalDamageDealtToChampions) {
        this.physicalDamageDealtToChampions = physicalDamageDealtToChampions;
    }

    public int getTotalDamageDealtToChampions() {
        return totalDamageDealtToChampions;
    }

    public void setTotalDamageDealtToChampions(int totalDamageDealtToChampions) {
        this.totalDamageDealtToChampions = totalDamageDealtToChampions;
    }

    public int getTrueDamageDealtPlayer() {
        return trueDamageDealtPlayer;
    }

    public void setTrueDamageDealtPlayer(int trueDamageDealtPlayer) {
        this.trueDamageDealtPlayer = trueDamageDealtPlayer;
    }

    public int getTrueDamageDealtToChampions() {
        return trueDamageDealtToChampions;
    }

    public void setTrueDamageDealtToChampions(int trueDamageDealtToChampions) {
        this.trueDamageDealtToChampions = trueDamageDealtToChampions;
    }

    public int getTrueDamageTaken() {
        return trueDamageTaken;
    }

    public void setTrueDamageTaken(int trueDamageTaken) {
        this.trueDamageTaken = trueDamageTaken;
    }

    public int getWardKilled() {
        return wardKilled;
    }

    public void setWardKilled(int wardKilled) {
        this.wardKilled = wardKilled;
    }

    public int getWardPlaced() {
        return wardPlaced;
    }

    public void setWardPlaced(int wardPlaced) {
        this.wardPlaced = wardPlaced;
    }

    public int getNeutralMinionsKilledEnemyJungle() {
        return neutralMinionsKilledEnemyJungle;
    }

    public void setNeutralMinionsKilledEnemyJungle(int neutralMinionsKilledEnemyJungle) {
        this.neutralMinionsKilledEnemyJungle = neutralMinionsKilledEnemyJungle;
    }

    public int getNeutralMinionsKilledYourJungle() {
        return neutralMinionsKilledYourJungle;
    }

    public void setNeutralMinionsKilledYourJungle(int neutralMinionsKilledYourJungle) {
        this.neutralMinionsKilledYourJungle = neutralMinionsKilledYourJungle;
    }

    public int getTotalTimeCrowdControlDealt() {
        return totalTimeCrowdControlDealt;
    }

    public void setTotalTimeCrowdControlDealt(int totalTimeCrowdControlDealt) {
        this.totalTimeCrowdControlDealt = totalTimeCrowdControlDealt;
    }

    public int getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(int playerRole) {
        this.playerRole = playerRole;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getBountyLevel() {
        return bountyLevel;
    }

    public void setBountyLevel(int bountyLevel) {
        this.bountyLevel = bountyLevel;
    }

    public boolean isNexusKilled() {
        return nexusKilled;
    }

    public void setNexusKilled(boolean nexusKilled) {
        this.nexusKilled = nexusKilled;
    }
}
