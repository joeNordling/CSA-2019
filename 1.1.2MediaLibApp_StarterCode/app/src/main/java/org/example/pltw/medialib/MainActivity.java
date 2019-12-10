package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);
;
    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        System.out.println("Welcome to your Media Library");
        Song Johnny = new Song();
        Song Banana = new Song();
        Movie Endgame = new Movie();
        Movie Matrix = new Movie();
        Book Bible = new Book();
        Book Leaders = new Book();
        Johnny.setTitle("Johnny B. Goode");
        System.out.println(Johnny.getTitle());
        Johnny.setRating(9);
        System.out.println(Johnny.getRating());
        Endgame.setTitle("Endgame");
        System.out.println(Endgame.getTitle());
        Endgame.setRating(10);
        System.out.println(Endgame.getRating());
        Bible.setTitle("The Bible");
        System.out.println(Bible.getTitle());
        Bible.setRating(10);
        System.out.println(Bible.getRating());
        Banana.setTitle("Banana Pancakes");
        Matrix.setTitle("The Matrix");
        Leaders.setTitle("Leaders Start with why?");
        outputText.append("SONGS:");
        outputText.append("\n");
        outputText.append(Johnny.getTitle());
        outputText.append("\n");
        outputText.append(Banana.getTitle());
        outputText.append("\n");
        outputText.append("MOVIES:");
        outputText.append("\n");
        outputText.append(Endgame.getTitle());
        outputText.append("\n");
        outputText.append(Matrix.getTitle());
        outputText.append("\n");
        outputText.append("BOOKS:");
        outputText.append("\n");
        outputText.append(Bible.getTitle());
        outputText.append("\n");
        outputText.append(Leaders.getTitle());
    }
}
