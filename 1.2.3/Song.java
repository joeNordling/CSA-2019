/**
 * Write a description of class Song here.
 *
 * @author Joe Nordling
 * @version 8/16/19
 */
public class Song {
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
    
    public Song() {
        rating = 0;
        title = "";
        price = 0.0;
        favorite = false;
    }
    
    public Song(String title) {
        this.title = title;
    }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
    }
    
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int r) {
        if(r > 0 && r < 10){
            rating = r;
        }
        else {
            System.out.println("Number is too big or too small");
        }
    }
     
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double t) {
        price = t;
    }
    
    public void addToFavorites(){
        favorite = true;
    }
    
}