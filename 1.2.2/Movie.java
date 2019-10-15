public class Movie {
    private int rating;
    private String title;
    private int duration;
    
    public Movie() {
        rating = 0;
        title = "";
        duration = 0;
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
    
    public int getDuration(){
        return duration;
    }
    
    public void setDuration(int d){
        duration = d;
    }
    
    public String getDurationFriendly(int d){
        int h = 0;
        int m = 0;
        while(d >= 60){
            h = h + 1;
            d = d - 60;
        }
        m = d;
        return Integer.toString(h) + " hours and " + Integer.toString(m) + " minutes";
    }   
}