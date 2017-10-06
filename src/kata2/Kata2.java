package kata2;

import java.util.Map;
import modelo.Histogram;

public class Kata2 {

    public static void main(String[] args) {
        
        Histogram histo = new Histogram(new int[]{1, 1, 0, 2, 0, 1, 1, 3});
        Map<Integer,Integer> histogr = histo.getHistogram();
            
        for (int key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }
    
}
