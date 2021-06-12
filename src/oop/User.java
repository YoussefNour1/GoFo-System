package oop;
/**
 * @author Yassen
 * @version 0.1
 * User class to store user's data
 */
public class User {
    /**
     * User's name
     */
    protected String name;
    /**
     * User's Username
     */
    protected String userName;
    /**
     * User's password
     */
    protected String password;
    /**
     * User's email
     */
    protected String email;
    /**
     * User's address
     */
    protected String address;
    /**
     * User's Id
     */
    protected String id;
    /**
     * EWallet
     */
    protected EWallet ewallet;

    /**
     * Default constructor
     */
      public User(){
        this.id = "";
        this.name = "";
        this.userName = "";
        this.password = "";
        this.email = "";
        this.address = "";
    }
    /**
     * This constructor is used to store User's data
     * @param id
     * @param name
     * @param userName
     * @param password
     * @param email
     * @param address
     */
    public User(String id, String name, String userName, String password, String email, String address){
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.address = address;
    }


    /**
     * To set user's name
     * @param name name of user
     */
    public void setName(String name)
    {
        this.name= name;
    }

    /**
     * To get user's name
     * @return name of user
     */
    public String getName()
    {
        return name;
    }

    /**
     * To set user's username
     * @param userName username of user
     */
    public void setUserName(String userName)
    {
        this.userName =userName;
    }

    /**
     * To get username
     * @return username of user
     */
    public String getUserName()
    {
        return userName;
    }

    /**
     * To set password
     * @param password user's password
     */
    public void setPassword(String password)
    {
        this.password=password;
    }

    /**
     * To get password
     * @return player's password
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * To set Email
     * @param email user's Email
     */
    public void setEmail(String email)
    {
        this.email=email;
    }

    /**
     * To get Email
     * @return Email of user
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * To set Address
     * @param address of user
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    /**
     * To get Address
     * @return address of user
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * To set Id
     * @param id user's Id
     */
       public void setId(String  id)
    {
        this.id = id;
    }

    /**
     * To get Id
     * @return Id of user
     */
    public String getId()
    {
        return id;
    }

    /**
     * To set EWallet
     * @param eWallet1 EWallet
     */
    public void setEWallet(EWallet eWallet1)
    {
        this.ewallet = eWallet1;
    }

    /**
     * To get EWallet
     * @return EWallet
     */
    public EWallet getEWallet(){
        return this.ewallet;
    }

    /**
     * To Check EWallet's Balance
     */
    public  void checkEWallet(){
        System.out.println(ewallet.getBalance());
    }

    /**
     * To store User's Data
     * @return Stored data(ID,Name,UserName,E-mail,Address,E=Wallet)
     */
    @Override
    public String toString() {
        return  "ID: " + id + '\n' +
                "Name='" + name + '\n' +
                "User Name: '" + userName + '\n' +
                "E-mail: '" + email + '\n' +
                "Address: '" + address + '\n' +
                "E-Wallet: " + ewallet;
    }
}
