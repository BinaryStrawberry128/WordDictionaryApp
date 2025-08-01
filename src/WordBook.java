import java.util.HashMap;
import java.util.Map;
public class WordBook {
    private final Map<String, String> dictionary = new HashMap<>();//make dictionary final so it can't be changed
    int count = 0;

    public boolean isWord(String word) {
        return dictionary.containsKey(word);
    }
    public void addWord(String word, String definition) {
        if(!isWord(word)){
        dictionary.put(word, definition);
        count++;
        }else{
            System.out.println("Word already exists");
        }
    }
    public String getDefinition(String word) {
        if (isWord(word)) {
            return dictionary.get(word);
        }else{
            return null;
        }
    }
    public void deleteWord(String word) {
        if(isWord(word)){
            dictionary.remove(word);
            count--;
        }else{
            System.out.println("Word does not exist");
        }
    }
    public int getCount() {
        return count;
    }

    public void printDictionary() {
        if(dictionary.isEmpty()) {
            System.out.println("Dictionary is empty");
            return;
        }
        System.out.println("------Dictionary------");
        for(String word: dictionary.keySet()){
            System.out.printf("%s: %s\n", word, dictionary.get(word));
        }
        System.out.println("----------------------");
        System.out.println("Number of words: " + count);
    }
}
