public class song
{
    int rating;
    String title;
    double price;
    boolean favorate;
    
    public song()
    {
        this.rating = 0;
        this.title = "";
        this.price = 0.0;
        this.favorate = false;
    }
    public String getTitle() 
    {
        return title;
    }
    public void setTitle(String t) 
    {
        title = t;
    }
    public int getRating()
    {
        return rating;
    }
    public void setRating(int r)
    {
        rating = r;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price = p;
    }
    public void addToFavorate()
    {
        favorate = true;
    }
}
