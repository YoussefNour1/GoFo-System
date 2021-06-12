package oop;
/**
 * @author Shahd
 * @version 0.1
 */
public class Team {
    /**
     * Name of team
     */
    private String teamName;
    /**
     * name of leader
     */
    private Player teamOwner;

    /**
     * To add player to the team
     * @param p the player
     */
    public void addPlayer(Player p){

    };

    /**
     * To remove player
     * @param p the player
     */
    public void removePlayer(Player p){

    };

    /**
     * To get name of team
     * @return Team's name
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * To set team's name
     * @param teamName name of team
     */
    public void setTeamName( String teamName ) {
        this.teamName = teamName;
    }

    /**
     * To return the team owner
     * @return team owner
     */
    public Player getTeamOwner() {
        return teamOwner;
    }

    /**
     * to set team owner
     * @param teamOwner team owner
     */
    public void setTeamOwner( Player teamOwner ) {
        this.teamOwner = teamOwner;
    }
}
