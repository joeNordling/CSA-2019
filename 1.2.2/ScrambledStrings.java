import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ScrambledStrings
{
    /********************** Part (a) *********************/

    /** Scrambles a given word.
     *  @param word the word to be scrambled
     *  @return the scrambled word (possibly equal to word)
     *  Precondition: word is either an empty string or contains
     *    only uppercase letters.
     *  Postcondition: the string returned was created from word
     *      as follows:
     *   - the word was scrambled, beginning at the first letter
     *      and continuing from left to right
     *   - two consecutive letters consisting of "A" followed by
     *        a letter that was not "A" were swapped
     *   - letters were swapped at most once
     */
    public static String scrambleWord(String word)
    {
        String[] letters = word.split("");
        boolean skip = false;
        for (int i = 1; i < word.length(); i++){
            if(skip){
                skip = false;
                continue;
            }
            char currentLetter = word.charAt(i);
            char lastLetter = word.charAt(i-1);
            if(currentLetter != 'A' && lastLetter == 'A'){
                 letters[i] = Character.toString(lastLetter);
                 letters[i-1] = Character.toString(currentLetter);
                 skip = true;
            }
        }
        
        return String.join(",", letters).replace(",", "");
    }

    /********************** Test *********************/
    public static void main(String[] args)
    {
        System.out.println("\nTesting Part (a):\n");

        String[] words = {"TAN", "ABRACADABRA", "WHOA",
                "AARDVARK", "EGGS", "A", ""};
        for (String word : words)
            System.out.println(word + " becomes " + scrambleWord(word));
    }
}
