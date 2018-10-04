
package kata2;
import java.util.HashMap;
import java.util.Map;

public class Kata2 {


    public static void main(String[] args) {
        int[] array = {1,3,2,6,8,4,2,2,5,6,9,1,4,4,4,6,1,2,9,3,2,0,0,1};
        Map<Integer, Integer> histogram  = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (histogram.containsKey(array[i])){
                histogram.put(array[i],histogram.get(array[i])+ 1);
            }else{
                histogram.put(array[i],1);
            }
        
            
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
            
    }
    
}
