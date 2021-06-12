package oop;
import java.util.ArrayList;

/**
 * @author shahd
 * @version 0.1
 * Amin class is used for controlling the playgrounds
 */
public class Admin {
    /**
     * name of admin
     * his password to login
     */
    String adminName, adminPassword;

    /**
     * to show the playground
     */
    public void displayPlayground(){};

    /**
     *To accept the playground
     */
    public void acceptPlayground(){};

    /**
     *To suspend the playground that was complained
     */
    public void suspendPlayground(){};

    /**
     *To delete the playground that was complainted
     */
    public void deletePlayground(){};

    /**
     *To add another admin
     * @param adminName a new admin name
     * @param adminPassword a new admin password
     */
    public void addAdmin(String adminName, String adminPassword){};
}
