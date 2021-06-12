package com.company;
import oop.*;

import oop.EWallet;

import java.util.Scanner;

/**
 * @author Yaseen
 * @version 0.1
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user;
        System.out.printf("How Do You Want To Login?%n1-Admin %n" + "2-Playground Owner %n" + "3-Player");
        user = input.next();
        if (user.equals("1")) {
            System.out.println("Enter Your Name");
            User use = new User();
            Scanner input1 = new Scanner(System.in);
            String n;
            n = input1.next();
            use.setName(n);

            System.out.println("Enter Your UserName");
            Scanner input2 = new Scanner(System.in);
            String u;
            u = input2.next();
            use.setUserName(u);

            System.out.println("Enter Your Password");
            Scanner input3 = new Scanner(System.in);
            String p;
            p = input3.next();
            use.setPassword(p);

            System.out.println("Enter Your Email");
            Scanner input4 = new Scanner(System.in);
            String e;
            e = input4.next();
            use.setEmail(e);

            System.out.println("Enter Your address");
            Scanner input5 = new Scanner(System.in);
            String a;
            a = input5.next();
            use.setAddress(a);

            System.out.println("Enter Your ID");
            Scanner input6 = new Scanner(System.in);
            String i;
            i = input6.next();
            use.setId(i);
        } else if (user.equals("2")) {
            System.out.println("Enter Your Name");
            User use = new User();
            PlaygroundOwner owner = new PlaygroundOwner();
            Scanner input1 = new Scanner(System.in);
            String n;
            n = input1.next();
            use.setName(n);

            System.out.println("Enter Your UserName");
            Scanner input2 = new Scanner(System.in);
            String u;
            u = input2.next();
            use.setUserName(u);

            System.out.println("Enter Your Password");
            Scanner input3 = new Scanner(System.in);
            String p;
            p = input3.next();
            use.setPassword(p);

            System.out.println("Enter Your Email");
            Scanner input4 = new Scanner(System.in);
            String e;
            e = input4.next();
            use.setEmail(e);

            System.out.println("Enter Your address");
            Scanner input5 = new Scanner(System.in);
            String a;
            a = input5.next();
            use.setAddress(a);

            System.out.println("Enter Your ID");
            Scanner input6 = new Scanner(System.in);
            String i;
            i = input6.next();
            use.setId(i);

            System.out.printf("What Do You Want ?%n1-Add Playground %n"+"2-Update Playground  %n"+"3-Show Bookings %n");
            Scanner input7 = new Scanner(System.in);
            String choice2;
            choice2 = input7.next();
            if (choice2.equals("1")) {
                owner.addPlayground();
            }
         /*else if (choice2=="2") {
         System.out.println("Enter old size");
         Scanner input8 = new Scanner(System.in);
         Playground b;
         b = input8.next();
         System.out.println("Enter New Size");
         Scanner input9 = new Scanner(System.in);
         String f;
         f = input9.next();
         owner.updatePlayground( b,f);

         }*/
            else if (choice2.equals("3")) {

                owner.showBookings();
            } else {
                System.out.println("Sorry,Enter valid choice ");
            }
        } else if (user.equals("3")) {
            Player player = new Player();
            Booking book = new Booking();
            System.out.println("Enter Your Name");
            User use = new User();
            Scanner input1 = new Scanner(System.in);
            String n;
            n = input1.next();
            use.setName(n);

            System.out.println("Enter Your UserName");
            Scanner input2 = new Scanner(System.in);
            String u;
            u = input2.next();
            use.setUserName(u);

            System.out.println("Enter Your Password");
            Scanner input3 = new Scanner(System.in);
            String p;
            p = input3.next();
            use.setPassword(p);

            System.out.println("Enter Your Email");
            Scanner input4 = new Scanner(System.in);
            String e;
            e = input4.next();
            use.setEmail(e);

            System.out.println("Enter Your address");
            Scanner input5 = new Scanner(System.in);
            String a;
            a = input5.next();
            use.setAddress(a);

            System.out.println("Enter Your ID");
            Scanner input6 = new Scanner(System.in);
            String i;
            i = input6.next();
            use.setId(i);

            System.out.printf("What Do You Want ?%n1-Booking%n"+"2-Create Team  %n"+"3-Check Balance ");
            Scanner input7 = new Scanner(System.in);
            String choice3;
            choice3 = input7.next();
            if (choice3.equals("1")) {
             System.out.println("Enter the number of playground");
             Scanner input9 = new Scanner(System.in);
             int num;
             num = Integer.parseInt(input9.next());
             System.out.println("Enter the time ");
             Scanner input10 = new Scanner(System.in);
             String time;
             time = input10.next();

             book.booking(player,num,time);
            }
            else if (choice3.equals("2")) {
              //Team with shahd
            }
            else if(choice3.equals("3"))
            {
                System.out.println("Enter your Id");
                Scanner input10 = new Scanner(System.in);
                String id;
                id = input10.next();
                EWallet wallet = new EWallet(id,p);
                System.out.println("Enter the Password ");
                Scanner input11 = new Scanner(System.in);
                String pass;
                pass = input11.next();
                wallet.check(id,p);

                System.out.printf("What Do You Want ?%n1-Withdraw%n"+"2-Deposit  %n"+"3-Transfer");
                Scanner inp = new Scanner(System.in);
                String choice;
                choice = inp.next();
                if (choice.equals("1"))
                { System.out.println("Enter amount of money");
                    Scanner input13 = new Scanner(System.in);
                    float wmoney;
                    wmoney = Float.parseFloat(input13.next());
                    wallet.withdraw(wmoney);
                }
                else if(choice.equals("2"))
                {
                  System.out.println("Enter amount of money");
                  Scanner input13 = new Scanner(System.in);
                  float Dmoney;
                  Dmoney = Float.parseFloat(input13.next());
                   wallet.deposit(Dmoney);
                }
                else  if(choice.equals("3"))
                {
                    System.out.println("Enter amount of money");
                    Scanner input13 = new Scanner(System.in);
                    float Tmoney;
                    Tmoney = Float.parseFloat(input13.next());
                    wallet.transfer(wallet,Tmoney);
                }
                else
                {
                  System.out.println("Sorry,Enter valid choice");
                }
            }
            else {
                System.out.println("Sorry,Enter valid choice");
            }
        } else {
            System.out.println("Sorry,Enter valid choice");
        }
        System.out.printf("Do You Want anything else?"+ "1-Yes" +"2-No");
        // اعمل انه يرجع تانى يستخدم م الاول عشان ضهري باظ ^_^

    }
}
