
package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int[] array = {1,3,2,6,8,4,2,2,5,6,9,1,4,4,4,6,1,2,9,3,2,0,0,1};
        Map<Integer, Integer> histogram  = new HashMap<>();
        for (int i : array) {
            histogram.put(i,histogram.containsKey(i) ? 
                    histogram.get(i)+ 1 : 1);
        } /*
        
0==>2
1==>4
2==>5
3==>2
4==>4
5==>1
6==>3
8==>1
9==>2
        */
    
            
            
            
        
            
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
            
    }
    
}
