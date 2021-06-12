package oop;
import java.util.ArrayList;

/**
 * This class is used to store playground's data
 * @author Youssef
 * @version 0.1
 */
public class Playground {
    /**
     * Name of playground
     */
    private String name;
    /**
     *Size of playground
     */
    private String size;
    /**
     *location of playground
     */
    private String location;
    /**
     *free time of playground
     */
    private String availableTimes;
    /**
     * Owner of playground
     */
    private String owner;
    /**
     *Status  of playground
     */
    private String statue;
    /**
     *situation of playground
     */
    private boolean activated;
    /**
     *Price of hour
     */
    private float pricePH;
    /**
     * playground number
     */
    private int playgroundNumber = 0;
    /**
     * Number of Booked playgrounds
     */
    ArrayList<Booking> bookedPlaygrounds;

    /**
     * This is default constructor
     */
    Playground()
    {

        name = "";
        size = "";
        location = "";
        pricePH = 0;
        activated = true;
        playgroundNumber += 1;
        statue = "active";
    }

    /**
     * this constructor is for storing playground's data
     * @param name
     * @param size
     * @param location
     * @param pricePH
     * @param availableTimes
     * @param owner
     * @param statue
     */
    Playground(String name, String size, String location, float pricePH, String availableTimes, String owner, String statue)
    {
        this.name = name;
        this.size = size;
        this.location = location;
        this.pricePH = pricePH;
        this.availableTimes = availableTimes;
        this.owner = owner;
        this.statue = statue;
    }

    /**
     * To get name of playground
     * @return name playground's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * To set name of playground
     * @param name name of playground
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * To get playground's size
     * @return size of playground
     */
    public String getSize()
    {
        return size;
    }

    /**
     * To set playground's size
     * @param size playground's size
     */
    public void setSize( String size ) {
        this.size = size;
    }

    /**
     * To get playground's location
     * @return location of playground
     */
    public String getLocation() {
        return location;
    }

    /**
     * To set playground's location
     * @param location location's playground
     */
    public void setLocation( String location ) {
        this.location = location;
    }

    /**
     * To get price per hour
     * @return price of 1 hour
     */
    public float getPricePH() {
        return pricePH;
    }

    /**
     * to set price per hour
     * @param pricePH price per 1 hour
     */
    public void setPricePH( float pricePH ) {
        this.pricePH = pricePH;
    }

    /**
     * To get available times
     * @return available times
     */
    public String getAvailableTimes() {
        return availableTimes;
    }

    /**
     * To set available times
     * @param availableTimes free times to be booked
     */
    public void setAvailableTimes( String availableTimes ) {
        this.availableTimes = availableTimes;
    }

    /**
     * To get owner
     * @return owner's name
     */
    public String getOwner() {
        return owner;
    }

    /**
     * to set owner
     * @param owner playground's owner
     */
    public void setOwner( PlaygroundOwner owner ) {
        this.owner = owner.getName();
    }

    /**
     * To define playground's situation
     * @return activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * To set the situation of playground
     * @param activated playground's situation
     */
    public void setActivated( boolean activated ) {
        this.activated = activated;
    }

    /**
     * To get playground's number
     * @return number of playground
     */
    public int getPlaygroundNumber() {
        return playgroundNumber;
    }

    /**
     * To set playground's number
     * @param playgroundNumber number of playground
     */
    public void setPlaygroundNumber( int playgroundNumber ) {
        this.playgroundNumber = playgroundNumber;
    }

    /**
     * To get playground's status
     * @return statue of playground
     */
    public String getStatue() {
        return statue;
    }

    /**
     * To set statue of playground
     * @param statue playground's statue
     */
    public void setStatue( String statue ) {
        this.statue = statue;
    }

    /**
     *
     * @return playground's data
     */
    @Override
    public String toString() {
        return "\nPlayground Number: " + playgroundNumber +
                "Name='" + name + '\n' +
                "Size='" + size + " m\n" +
                "Location='" + location + '\n' +
                "Price: " + pricePH + " pounds per hour\n" +
                "Available Times: '" + availableTimes + '\n' +
                "Owner: " + owner + '\n' +
                "Statue='" + statue + '\n' +
                "Booked Playgrounds: " + bookedPlaygrounds +'\n'+
                "===============================================" ;
    }
}
