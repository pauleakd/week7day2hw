package example.codeclan.com.countingwords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by paulevaris on 18/04/2017.
 */

public class Words {

    private ArrayList<String> wordList;
    private HashMap<String, Integer> wordListHashed;

    public Words(String passedString){

       wordList = new ArrayList<String>(Arrays.asList(passedString.split(" "))) ;
    }

    public int wordCount(){
        return wordList.size();
    }

    public ArrayList<String> getWordList() {
        return wordList;
    }

    public HashMap countInHash() {
       HashMap<String, Integer> wordListHashed = new HashMap<String, Integer>();
        Integer one = 1;
        for(String item: wordList){
            if(wordListHashed.containsKey(item) == false) {
                wordListHashed.put(item, one);
            }
            else{
                wordListHashed.put(item, wordListHashed.get(item) + 1);
            }
        }
        return wordListHashed;
    }
}
