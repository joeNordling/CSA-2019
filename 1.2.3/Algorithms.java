public class Algorithms
{
    public static void main(String[] args)
    {
        Song[] topTenSongs = {new Song("Hey Jude", .99, 2),
                              new Song("Smooth", .99, 2),
                              new Song("The Twist", .99, 1),
                              new Song("How Do I Live", .99, 2),
                              new Song("Mack the Knife", .99, 3), 
                              new Song("Physical", .99, 8),
                              new Song("Party Rock Anthem", .99, 5), 
                              new Song("Macarena", .99, 7), 
                              new Song("You Light Up My Life", .99, 8), 
                              new Song("I Gotta Feeling", .99, 6)};
        for(Song s: topTenSongs){
            System.out.println(s.getTitle() + " Rating: " + s.getRating());
        }
        
        System.out.println(getBestSong(topTenSongs).getTitle() + " is my favorite song.");
        System.out.println(getWorstSong(topTenSongs).getTitle() + " is my least favorite song.");
        for(Song s: getTies(topTenSongs, 2)){
            if(s != null){
                System.out.println(s.getTitle() + " is tied for the position, " );
            }
        }
        
        System.out.println("This is the list with one song removed");
        for(Song s: removeSongs(topTenSongs, "The Twist")){
            if(s != null){
                System.out.println(s.getTitle());
            }
        }
        
        topTenSongs = removeSongs(topTenSongs, "The Twist");
        System.out.println("This is the list with one song added");
        for(Song s: addSong(topTenSongs, new Song("Stairway to Heaven", .99, 3))){
            System.out.println(s.getTitle());
        }
    }     
   
    public static Song getBestSong(Song[] songs){
        Song bestSoFar = songs[0];
        
        for(Song s: songs){
            if(s.getRating() < bestSoFar.getRating()){
                    bestSoFar = s;
            }
        }
        
        return bestSoFar;
    }
    
    public static Song getWorstSong(Song[] songs){
        Song worstSoFar = songs[0];
        
        for(Song s: songs){
            if(s.getRating() > worstSoFar.getRating()){
                    worstSoFar = s;
            }
        }
        
        return worstSoFar;
    }
    
    public static Song[] getTies(Song[] songs, int position){
        int i = 0;
        Song[] tied = new Song[songs.length];
        for(Song s: songs){
            if(s.getRating() == position){
                tied[i] = s;
                i++;
            }
        }
        return tied;
    }
    
    public static Song[] removeSongs(Song[] songs, String titleToRemove){
        Song[] newList = songs;
        for(int i = 0; i < newList.length; i++){
            try{
                Song checkSong = newList[i];
                if(checkSong.getTitle() == (titleToRemove)){
                    for(int a = i; a < newList.length; a++){
                        try{
                            newList[a] = newList[a+1];
                        } catch(Exception e){
                            newList[a] = null;
                        }
                    }
                }
            } catch(Exception e){
                
            }
        }
        return newList;
    }
    
    public static Song[] addSong(Song[] songs, Song song){
        Song[] newList = songs;
        for(int i = 0; i < newList.length; i++){
            if(newList[i] == null){
                newList[i] = song;
                break;
            }
        }
        return newList;
    }
}

