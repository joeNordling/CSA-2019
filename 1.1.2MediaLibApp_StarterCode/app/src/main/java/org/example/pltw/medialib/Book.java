package org.example.pltw.medialib;

public class Book {
    private int rating;
    private String title;

    public Book() {
        rating = 0;
        title = "";
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
}