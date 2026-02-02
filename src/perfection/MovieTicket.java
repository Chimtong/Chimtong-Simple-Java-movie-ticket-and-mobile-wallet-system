package perfection;

import java.util.Scanner;

import static perfection.MobileWallet.prices;

public class MovieTicket {

    static String[] movies={"Avengers","Lion King","Spider-Man"};
    static double[] tPrice = {700,500,600};
    static double balance = 2000;

    static Scanner input = new Scanner(System.in);

    static void mainMenu(){
        System.out.println("WELCOME TO MOVIE MAX");
        int select;
        do{
            System.out.println("1. View Movies");
            System.out.println("2. Book Ticket");
            System.out.println("3. Check Wallet Balance");
            System.out.println("4. Exit");
            System.out.println("choose one of the options above(1-4)");
            select = input.nextInt();
            switch (select){
                case 1 -> viewMovies();
                case 2 -> bookTicket();
                case 3 -> checkBalance();  
                case 4 ->  System.out.println("Thankyou for choosing us!");
                default -> System.out.println("Invalid choice");
            }
        } while(select != 4);
       
    }

    static void viewMovies() {
        System.out.println("MOVIE MENU");
        for(int i = 0; i < movies.length; i++){
            System.out.println((i+1)+". " + movies[i] + "- KES " + tPrice[i]);
        }
    }
    static void bookTicket(){
        viewMovies();
        System.out.println("Select the movie you'd like to watch (1-3): ");
        int choice = input.nextInt();
        if(choice<1||choice>3){
            System.out.println("please select a number that's within 1-3");
            return;
        }
        System.out.println("select how many tickets you want to purchase: ");
        int quantity = input.nextInt();
        
        if(quantity<1){
            System.out.println("number of tickets you want can't be less than zero.");
            return;
        }
        
        double totalCost = tPrice[choice-1] * quantity ;
        if(totalCost>balance){
            System.out.println("insufficient funds");
            return;
        }
        System.out.println("you booked " + quantity +" tickets of " + movies[choice-1]);
        System.out.println("Total cost: KES "+ totalCost );
        balance-=totalCost;
    }
    static void checkBalance(){
        System.out.println("your balance is: KES " + balance);
    }

    public static void main(String[] args) {
        mainMenu();
    }
}