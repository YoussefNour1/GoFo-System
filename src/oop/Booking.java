package oop;
/**
 * @author Youssef
 * @version 0.1
 * Booking class is used to Book playground
 */
public class Booking {
    /**
     * player Id
     */
    private String playerID;
    /**
     * number of playground
     */
    private int playgroundNumber;
    /**
     * time of slot that user want to book
     */
    private String timeSlot;

    /**
     * This os used to book a playground
     * @param player player name
     * @param playgroundNumber playground number
     * @param timeSlot  time of Booking
     */
    public void booking(Player player, int playgroundNumber, String timeSlot) {
        this.playerID = player.getId();
        this.playgroundNumber = playgroundNumber;
        this.timeSlot = timeSlot;
    }

    /**
     * To set time of booking
     * @param timeSlot Time of booking
     */
    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    /**
     *To get time of Booking
     * @return timeslot
     */
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * To get the number of playground
     * @return Number of playground
     */
    public int getPlaygroundNumber() {
        return playgroundNumber;
    }

    /**
     * To set playground number
     * @param playgroundNumber number of playground
     */
    public void setPlaygroundNumber( int playgroundNumber ) {
        this.playgroundNumber = playgroundNumber;
    }

    /**
     * To return playerId
     * @return player's Id
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * To set the player's Id
     * @param player the player
     */
    public void setPlayerID( Player player ) {
        this.playerID = player.getId();
    }
}
