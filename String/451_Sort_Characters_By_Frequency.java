import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class Solution {
    public String frequencySort(String s) {

        HashMap<Character,Integer> hm = new HashMap<> ();
        for ( char ch: s.toCharArray() ){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        

        StringBuilder sb =  new StringBuilder();

        for(Map.Entry<Character,Integer> entry : list ){
            char ch = entry.getKey();
            int  freq = entry.getValue();
            
            for(int i=0; i<freq; i++){
                sb.append(ch);            
            }           
        } 

        return sb.toString();
    }
}
