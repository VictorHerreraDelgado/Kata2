/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Usuario
 */
public class Histogram {
    private final int [] array;
    public Histogram(int[] array){
       this.array = array;
   }
    public int [] getArray(){
        return array;
    }
    public Map getHistogram(){
        Map<Integer, Integer> histogram  = new HashMap<>();
        for (int i : array) {
            histogram.put(i,histogram.containsKey(i) ? 
                    histogram.get(i)+ 1 : 1);
        }
        return histogram;
    }
}