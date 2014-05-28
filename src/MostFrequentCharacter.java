import java.util.HashMap;
import java.util.Iterator;


/**
 * Created with IntelliJ IDEA.
 * User: longhuayou
 * Date: 5/20/14
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MostFrequentCharacter {
    public static char findMostFreq(String s) {
        HashMap<Character, Integer> char_freq = new HashMap<Character, Integer>();

        for (char c : s.toCharArray()) {

            if (char_freq.containsKey(c)) {
                char_freq.put(c, char_freq.get(c) + 1);
            }
            else {
                char_freq.put(c, 1);
            }
        }

        Iterator<Character> keySetIterator = char_freq.keySet().iterator();
        int res = 0;
        char ch = 'a';

        while(keySetIterator.hasNext()){
            char c = keySetIterator.next();
            if (char_freq.get(c) > res) {
                res = char_freq.get(c);
                ch = c;
            }

        }

        return ch;

    }
}
