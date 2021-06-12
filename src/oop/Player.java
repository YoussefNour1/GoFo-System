package oop;
import java.util.ArrayList;

/**
 * Player class is used to Storing player's Data
 * @author Youssef
 * @version 0.1
 */
public class Player extends User {
    ArrayList<String> invitations = new ArrayList<>();
    ArrayList<Booking> playerBooks = new ArrayList<>();
    /**
     * The EWallet
     */
    EWallet eWallet;

    /**
     * This constructor used to call user class' constructors
     */
    public Player(){
        super();
    }

    /**
     * This constructor is used to Store player's data
     * @param id player's Id
     * @param name player's name
     * @param userName player's username
     * @param password player's password
     * @param email player's email
     * @param address player's address
     */
    Player(String id,String name, String userName, String password, String email, String address)
    {
        super(id, name, userName, password, email, address);
        eWallet = new EWallet(id, password);
    }

    /**
     * To get available playgrounds
     * @param playgrounds the playgrounds
     */
    public void getAvailablePlayground(ArrayList<Playground> playgrounds) {
        System.out.println("Available Playgrounds: ");
        for (Playground playground : playgrounds) {
            System.out.println(playground);
        }
    }



}
