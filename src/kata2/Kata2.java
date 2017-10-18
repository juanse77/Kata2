package kata2;

import java.util.Map;
import modelo.Histogram;

public class Kata2 {

    public static void main(String[] args) {
        
        Histogram histo = new Histogram(new String[]{"Rosa", "Pepe", "Pepe", "Juan", "Pepe", "Rosa"});
        Map<String,Integer> histogr = histo.getHistogram();
            
        for (String key : histogr.keySet()) {
            System.out.println(key + " ==> " + histogr.get(key));
        }
    }   
}
