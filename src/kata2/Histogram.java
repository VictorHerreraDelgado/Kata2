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
public class Histogram<T> {
    private final T [] array;
    public Histogram(T[] array){
       this.array = array;
   }
    public T [] getArray(){
        return array;
    }
    public Map getHistogram(){
        Map<T, Integer> histogram  = new HashMap<>();
        for (T i : array) {
            histogram.put(i,histogram.containsKey(i) ? 
                    histogram.get(i)+ 1 : 1);
        }
        return histogram;
    }
}
