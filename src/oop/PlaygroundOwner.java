package oop;
import java.util.ArrayList ;
import java.util.Scanner;

/**
 * @author Yassen
 * @version 0.1
 * To store data of playground's owner
 */
public class PlaygroundOwner extends User {
    /**
     * ArrayList for playgrounds
     */
    ArrayList<Playground> playgrounds;
    /**
     * playground
     */
    Playground playground;

    /**
     * Default constructor
     */
    public PlaygroundOwner() {}
    /**
     * This constructor is used to store a new playground
     * @param id
     *  @param name
     *  @param userName
     * @param password
     *@param email
     * @param address
     */
    public PlaygroundOwner(String id,String name, String userName, String password, String email, String address)
    {
        super(id, name, userName, password, email, address);
        EWallet eWallet = new EWallet(id, password);
        playgrounds = new ArrayList<>();
    }

    /**
     * To add new playground
     */
    public void addPlayground() {
        Scanner scan = new Scanner(System.in);
        String PlaygroundName, size, location, availableTimes, owner, statue;
        float pricePH;
        System.out.println("Enter Playground Name: ");
        PlaygroundName = scan.nextLine();

        System.out.println("Enter playground size : ");
        size = scan.nextLine();

        System.out.println("Enter Playground location : ");
        location = scan.nextLine();

        System.out.println("Enter Playground price per hour : ");
        pricePH = scan.nextFloat();

        System.out.println("Enter playground available times : ");
        availableTimes = scan.nextLine();

        System.out.println("Enter playground statue: ");
        statue = scan.nextLine();

        System.out.println("Enter playground Owner name: ");
        owner = this.name;

        playground = new Playground(PlaygroundName, size, location, pricePH, availableTimes, owner, statue);
        playgrounds.add(playground);
        System.out.println("\nSuccessfully Added!\n");

    }

    /**
     * To update a playground's data
     * @param before old size
     * @param after new size
     * @return true if there is update
     */
    public boolean updatePlayground(Playground before , Playground after)
    {
        for ( int i=0;i<playgrounds.size();i++)
            if (playgrounds.get(i)== before)
            {
                playgrounds.set(i,after);
                return true ;
            }
        return false;
    }

    /**
     * To get playgrounds
     * @return playgrounds were added
     */
    public ArrayList<Playground> getPlaygrounds()
    {
        return playgrounds;
    }

    /**
     * To get Bookings
     * @return Bookings
     */
    public String getBookings()
    {
        StringBuilder res;
        res = new StringBuilder();
        for (Playground playground : playgrounds) {
            res.append(playground.toString());
        }
        return res.toString();
    }

    /**
     * To show Bookings
     */
    public void showBookings()
    {
        if (playgrounds.size()==0)
        {
            System.out.print("No Bookings");
            return;
        }
        for (Playground playground : playgrounds) System.out.print(playground.toString());
    }
}