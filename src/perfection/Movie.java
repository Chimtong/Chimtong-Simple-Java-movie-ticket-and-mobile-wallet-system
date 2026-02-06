package perfection;

public class Movie {
    String name;
    double price;

    Movie(String name,double price){
        this.name= name;
        this.price = price;
    }
    void printMovie(int index) {
        System.out.println((index + 1) + ". " + name + " - KES " + price);
    }


}
