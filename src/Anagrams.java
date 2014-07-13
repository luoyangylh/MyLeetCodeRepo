// Anagrams 

public class Solution {
    public List<String> anagrams(String[] strs) {
    	List<String> res = new ArrayList<String>();
    	if (strs == null)
    		return res;

    	HashMap<String, List<String>> hm = new HashMap<String, List<String>>();

    	for (String s: strs) {
    		char[] cs = s.toCharArray();
    		Arrays.sort(cs);
    		String ns = new String(cs);
    		if (hm.containsKey(ns)) {
    			hm.get(ns).add(s);
    		} else {
    			List<String> tmp = new ArrayList<String>();
    			tmp.add(s);
    			hm.put(ns, tmp);
    		}
    	}

    	Iterator<String> keySetIterator = hm.keySet().iterator();
		while(keySetIterator.hasNext()){
  			String key = keySetIterator.next();
  			if (hm.get(key).size() > 1) {
  				for (String s: hm.get(key)) {
  					res.add(s);
  				}
  			}
		}
        return res;
    }
}