package example.codeclan.com.countingwords;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by paulevaris on 18/04/2017.
 */

public class Words {

    private ArrayList<String> wordList;

    public Words(String passedString){

       wordList = new ArrayList<String>(Arrays.asList(passedString.split(" "))) ;
    }

    public int wordCount(){
        return wordList.size();
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }
}
