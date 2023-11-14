import java.util.Scanner;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        String name = "";
        String mobile = "";
        String email = "";
        String address = "";
        Timestamp timestamp = null;
        String issue = "";

        System.out.println("Welcome to the service center, which service help do you need?");
        System.out.println("1. Laptops \n2. Mobiles \n3. Tablets \n4. PCs \nType 'Q' to quit");
        Scanner in = new Scanner(System.in);
        String selection = in.nextLine();
        while (!selection.equals("Q")){
            switch (selection) {
                case "1":
                    System.out.println("Please describe the issue with your Laptop?");
                    issue = in.nextLine();
                    break;
                case "2":
                    System.out.println("Please describe the issue with your Mobile?");
                    issue = in.nextLine();
                    break;
                case "3":
                    System.out.println("Please describe the issue with your Tablet?");
                    issue = in.nextLine();
                    break;
                case "4":
                    System.out.println("Please describe the issue with your PC?");
                    issue = in.nextLine();
                    break;
                default:
                    System.out.println("Please try again and select one of the options");
            }
            System.out.println("What is your name?");
            name = in.nextLine();
            System.out.println("Best number to contact you on?");
            mobile = in.nextLine();
            System.out.println("Best email to contact you on?");
            email = in.nextLine();
            System.out.println("What is your address?");
            address = in.nextLine();
            // create time stamp
            timestamp = new Timestamp(System.currentTimeMillis());
            printData(name, mobile, email, address,timestamp, issue);
            System.out.println("Do you need help with another service? \nType 'Q' to quit");
            selection = in.nextLine();
            if (!selection.equals("Q")){
                System.out.println("1. Laptops \n 2. Mobiles \n 3. Tablets \n 4. PCs \n Type 'Q' to quit");
                selection = in.nextLine();
            }
        }

    }

    private static void printData(String name,String mobile,String email,String address,Timestamp timestamp,String issue) {
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Time: " + timestamp);
        System.out.println("Customer Issue: " + issue);
    }

}





















//// base class
//class Bicycle {
//    // the Bicycle class has two fields
//    public int gear;
//    public int speed;
//
//    // the Bicycle class has one constructor
//    public Bicycle(int gear, int speed)
//    {
//        this.gear = gear;
//        this.speed = speed;
//    }
//
//    // the Bicycle class has three methods
//    public void applyBrake(int decrement)
//    {
//        speed -= decrement;
//    }
//
//    public void speedUp(int increment)
//    {
//        speed += increment;
//    }
//
//    // toString() method to print info of Bicycle
//    public String toString()
//    {
//        return ("No of gears are " + gear + "\n"
//                + "speed of bicycle is " + speed);
//    }
//}
//
//// derived class
//class MountainBike extends Bicycle {
//
//    // the MountainBike subclass adds one more field
//    public int seatHeight;
//
//    // the MountainBike subclass has one constructor
//    public MountainBike(int gear, int speed,
//                        int startHeight)
//    {
//        // invoking base-class(Bicycle) constructor
//        super(gear, speed);
//        seatHeight = startHeight;
//    }
//
//    // the MountainBike subclass adds one more method
//    public void setHeight(int newValue)
//    {
//        seatHeight = newValue;
//    }
//
//    // overriding toString() method
//    // of Bicycle to print more info
//    @Override public String toString()
//    {
//        return (super.toString() + "\nseat height is "
//                + seatHeight);
//    }
//}
