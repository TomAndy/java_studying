package chapter.collections;

/*
Fill a HashMap with key-value pairs. Print the results to show
ordering by hash code. Extract the pairs, sort by key, and place the result into a
LinkedHashMap. Show that the insertion order is maintained
 */

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(100,"hi");
        map.put(400,"ok");
        map.put(2,"it");
        map.put(12,"like");
        List ls = new ArrayList(map.keySet());
        Collections.sort(ls);
        System.out.println(ls);
        Map map2 = new LinkedHashMap();
        Iterator iter = ls.iterator();
        while(iter.hasNext()) {
            int key = (Integer)iter.next();
            map2.put(key,map.get(key));
        }
        System.out.println(map2);
    }
}
